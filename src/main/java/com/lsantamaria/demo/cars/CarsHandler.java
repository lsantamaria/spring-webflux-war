package com.lsantamaria.demo.cars;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import java.net.URI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class CarsHandler {

  private final CarsService carsService;

  public Mono<ServerResponse> fetchCars(ServerRequest request) {
    return ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(carsService.getCars(), Car.class);
  }

  public Mono<ServerResponse> addCar(ServerRequest request) {
    return
        request
            .bodyToMono(Car.class)
            .flatMap(carsService::addCar)
            .flatMap(
                car ->
                    ServerResponse.created(URI.create("/cars/" + car.getId()))
                        .contentType(MediaType.APPLICATION_JSON).build()
            );
  }
}

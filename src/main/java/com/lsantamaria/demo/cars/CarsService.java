package com.lsantamaria.demo.cars;

import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CarsService {
  private final CarRepository carRepository;

  public Publisher<Car> getCars(){
    return Flux.fromIterable(carRepository.findAll());
  }

  public Mono<Car> addCar(Car car) {
    return Mono.fromSupplier(() -> carRepository.save(car));
  }
}

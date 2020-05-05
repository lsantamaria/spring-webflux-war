package com.lsantamaria.demo.cars;

import static java.util.Arrays.asList;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CarsLoader {
  private final CarRepository carRepository;

  @EventListener({ContextRefreshedEvent.class})
  public void handleContextStart(ContextRefreshedEvent cse) {
    carRepository.saveAll(
        asList(
            new Car("1", "Honda"),
            new Car("2", "Ford"),
            new Car("3", "Renault")
        )
    );
  }
}

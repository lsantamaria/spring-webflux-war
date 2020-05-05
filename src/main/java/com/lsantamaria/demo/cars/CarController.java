package com.lsantamaria.demo.cars;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {
  private final CarRepository carRepository;

  @GetMapping("/cars-classic")
  public List<Car> getCars(){
    return carRepository.findAll();
  }
}

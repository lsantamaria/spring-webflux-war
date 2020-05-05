package com.lsantamaria.demo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.lsantamaria.demo.cars"})
@ComponentScan(basePackages = {"com.lsantamaria.demo"})
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.lsantamaria.demo.cars"})
@PropertySource(value = "classpath:application.yml", ignoreResourceNotFound = true)
public class AppConfig {
}

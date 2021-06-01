package com.advance_kristian.car_project.repository;

import com.advance_kristian.car_project.model.CarPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarPriceRepository extends JpaRepository<CarPriceRepository,Long> {
    Optional<CarPrice> findByType(String type);
}

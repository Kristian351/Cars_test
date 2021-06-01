package com.advance_kristian.car_project.repository;

import com.advance_kristian.car_project.model.Manufacture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ManufactureRepository extends JpaRepository<Manufacture, Long> {

     Optional<Manufacture>findByNumber(Integer number);
}

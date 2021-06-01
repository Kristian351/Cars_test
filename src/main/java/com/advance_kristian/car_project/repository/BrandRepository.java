package com.advance_kristian.car_project.repository;

import com.advance_kristian.car_project.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand,Long> {

    static Optional<Object> findByString(String name) {
        return null;
    }

}

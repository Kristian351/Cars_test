package com.advance_kristian.car_project.repository;

import com.advance_kristian.car_project.model.YearModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface YearModelRepository extends JpaRepository<YearModel, Long> {

    public Optional<YearModel> findByNumber(Integer number);
}

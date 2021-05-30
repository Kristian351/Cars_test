package com.advance_kristian.car_project.service;


import com.advance_kristian.car_project.dto.YearModelDto;
import com.advance_kristian.car_project.exception.ThrowNotFoundException;
import com.advance_kristian.car_project.model.YearModel;
import com.advance_kristian.car_project.repository.YearModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;


@Service
public class YearModelService {

    private static YearModelRepository yearModelRepository = null;

    @Autowired
    public YearModelService(YearModelRepository yearModelRepository) {
        this.yearModelRepository = yearModelRepository;

    }
    public static YearModelDto findByNumber(@NotNull Integer number) {
        yearModelRepository.findByNumber(number)
                .orElseThrow(()-> new ThrowNotFoundException(String.format("Year of this model is not found", number)));

        return YearModelDto.builder()
                .id(YearModel.getId)
                .number(YearModel.getNumber)
                .build();


    }
}

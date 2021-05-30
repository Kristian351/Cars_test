package com.advance_kristian.car_project.service;

import com.advance_kristian.car_project.dto.YearModelDto;
import com.advance_kristian.car_project.exception.ThrowNotFoundException;
import com.advance_kristian.car_project.model.YearModel;
import com.advance_kristian.car_project.repository.BrandRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class BrandService {

    private static BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public static YearModelDto findByString(@NotNull String name ) {
        brandRepository.findByString()
                .orElseThrow(() -> new ThrowNotFoundException(String.format("Brand is not found", name)));

        return YearModelDto.builder()
                .id(YearModel.getId)
                .number(YearModel.getString)
                .build();

    }
}

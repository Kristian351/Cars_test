package com.advance_kristian.car_project.service;

import com.advance_kristian.car_project.dto.BrandDto;
import com.advance_kristian.car_project.dto.Manufacture;
import com.advance_kristian.car_project.exception.RecordNotFoundException;
import com.advance_kristian.car_project.repository.BrandRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class BrandService {

    private final BrandRepository brandRepository;
    private final BrandService brandService;
    private final CarPriceService carPriceService;

    public BrandService(BrandRepository brandRepository, BrandService brandService, CarPriceService carPriceService) {
        this.brandRepository = brandRepository;
        this.brandService = brandService;
        this.carPriceService = carPriceService;
    }


    public static Manufacture findByString(@NotNull String name ) {
        BrandRepository.findByType(name)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Brand is not found", name)));

        return Manufacture.builder()
                .id(com.advance_kristian.car_project.model.Manufacture.getId)
                .number(com.advance_kristian.car_project.model.Manufacture.getString)
                .build();

    }

    public BrandDto findById(Long brandId) {
        return null;
    }
}

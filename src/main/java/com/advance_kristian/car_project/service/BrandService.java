package com.advance_kristian.car_project.service;

import com.advance_kristian.car_project.dto.BrandDto;
import com.advance_kristian.car_project.exception.RecordNotFoundException;
import com.advance_kristian.car_project.model.Brand;
import com.advance_kristian.car_project.repository.BrandRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class BrandService {
    private final BrandRepository brandRepository;
    private final BrandService brandService;
    private final CarPriceService carPriceService;
    private final ManufactureService manufactureService;

    public BrandService(BrandRepository brandRepository, BrandService brandService, CarPriceService carPriceService, ManufactureService manufactureService) {
        this.brandRepository = brandRepository;
        this.brandService = brandService;
        this.carPriceService = carPriceService;
        this.manufactureService = manufactureService;
    }


    public Brand findByString(@NotNull String name ) {
        BrandRepository.findByString(name)
                .orElseThrow(() -> new RecordNotFoundException(String.format("Brand is not found", name)));

        return Brand.builder()
                .id(Brand.getId)
                .name(Brand.getString)
                .build();

    }

    public BrandDto findById(Long brandId) {
        return null;
    }
}

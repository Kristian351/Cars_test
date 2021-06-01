package com.advance_kristian.car_project.service;

import com.advance_kristian.car_project.dto.BrandDto;
import com.advance_kristian.car_project.dto.CarPriceDto;
import com.advance_kristian.car_project.repository.CarPriceRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class CarPriceService {

    private final CarPriceRepository carPriceRepository;
    private final BrandService brandService;

    public CarPriceService(CarPriceRepository carPriceRepository, BrandService brandService) {
        this.carPriceRepository = carPriceRepository;
        this.brandService = brandService;
    }

    public void save(@NotNull CarPriceDto carPriceDto) {

        BrandDto brandDto = brandService.findById((carPriceDto.getBrandId()));
    }
}

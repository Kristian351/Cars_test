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
    private final ManufactureService manufactureService;
    private final CarPriceService carPriceService;

    public CarPriceService(CarPriceRepository carPriceRepository, BrandService brandService, ManufactureService manufactureService, CarPriceService carPriceService) {
        this.carPriceRepository = carPriceRepository;
        this.brandService = brandService;
        this.manufactureService = manufactureService;
        this.carPriceService = carPriceService;
    }

    public void save(@NotNull CarPriceDto carPriceDto) {

        BrandDto brandDto = brandService.findById((carPriceDto.getBrandId()));
    }
}

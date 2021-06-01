package com.advance_kristian.car_project.service;


import com.advance_kristian.car_project.dto.ManufactureDto;
import com.advance_kristian.car_project.exception.RecordNotFoundException;
import com.advance_kristian.car_project.model.Manufacture;
import com.advance_kristian.car_project.repository.ManufactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;


@Service
public class ManufactureService {
    private final ManufactureRepository manufactureRepository;
    private final ManufactureService manufactureService;
    private final BrandService brandService;
    private final CarPriceService carPriceService;

    @Autowired
    public ManufactureService(ManufactureRepository manufactureRepository, ManufactureService manufactureService, BrandService brandService, CarPriceService carPriceService) {
        this.manufactureRepository = manufactureRepository;
        this.manufactureService = manufactureService;
        this.brandService = brandService;
        this.carPriceService = carPriceService;
    }
    public static ManufactureDto findByNumber(@NotNull Integer number) {
        ManufactureRepository.findByNumber(Number)
                .orElseThrow(()-> new RecordNotFoundException(String.format("Year of this model is not found", number)));

        return ManufactureDto.builder()
                .id(Manufacture.getId)
                .number(Manufacture.getNumber)
                .build();


    }
}

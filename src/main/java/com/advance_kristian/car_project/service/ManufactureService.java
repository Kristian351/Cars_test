package com.advance_kristian.car_project.service;


import com.advance_kristian.car_project.dto.Manufacture;
import com.advance_kristian.car_project.exception.RecordNotFoundException;
import com.advance_kristian.car_project.repository.ManufactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;


@Service
public class ManufactureService {
    private final ManufactureRepository manufactureRepository;
    private final ManufactureService manufactureService;
    private final BrandService brandService;

    @Autowired
    public ManufactureService(ManufactureRepository manufactureRepository, ManufactureService manufactureService, BrandService brandService) {
        this.manufactureRepository = manufactureRepository;
        this.manufactureService = manufactureService;
        this.brandService = brandService;
    }
    public static Manufacture findByNumber(@NotNull Integer number) {
        ManufactureRepository.findByNumber(Number)
                .orElseThrow(()-> new RecordNotFoundException(String.format("Year of this model is not found", number)));

        return Manufacture.builder()
                .id(com.advance_kristian.car_project.model.Manufacture.getId)
                .number(com.advance_kristian.car_project.model.Manufacture.getNumber)
                .build();


    }
}

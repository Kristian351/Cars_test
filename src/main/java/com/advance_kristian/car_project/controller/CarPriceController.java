package com.advance_kristian.car_project.controller;

import com.advance_kristian.car_project.dto.CarPriceDto;
import com.advance_kristian.car_project.service.CarPriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/car_prices")
public class CarPriceController {

    private final CarPriceService carPriceService;

    public CarPriceController(CarPriceService carPriceService) {
        this.carPriceService = carPriceService;
    }

    @GetMapping(value = "/{String}")
    public ResponseEntity findByString(@PathVariable String name) {

        return ResponseEntity.ok((CarPriceDto.findByString(name)));
    }
}

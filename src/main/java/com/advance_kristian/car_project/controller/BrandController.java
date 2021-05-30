package com.advance_kristian.car_project.controller;

import com.advance_kristian.car_project.dto.BrandDto;
import com.advance_kristian.car_project.service.BrandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/brands")
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping(value = "/{String}")
    public ResponseEntity<Object> findByString(@PathVariable String name) {

        return ResponseEntity.ok((BrandDto.findByString(name)));
    }
}

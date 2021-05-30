package com.advance_kristian.car_project.controller;

import com.advance_kristian.car_project.dto.YearModelDto;
import com.advance_kristian.car_project.service.YearModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/yearModels")
public class YearModelController {

    private final YearModelService yearModelService;

    public YearModelController(YearModelService yearModelService) {
        this.yearModelService = yearModelService;
    }

    @GetMapping(value = "/{number}")
    public ResponseEntity<YearModelDto> findByNumber(@PathVariable Integer number){

        return ResponseEntity.ok((YearModelService.findByNumber(number)));
    }

}

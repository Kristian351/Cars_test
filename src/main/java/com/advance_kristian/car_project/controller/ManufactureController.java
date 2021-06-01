package com.advance_kristian.car_project.controller;

import com.advance_kristian.car_project.dto.Manufacture;
import com.advance_kristian.car_project.service.ManufactureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/yearModels")
public class ManufactureController {

    private final ManufactureService manufactureService;

    public ManufactureController(ManufactureService manufactureService) {
        this.manufactureService = manufactureService;
    }

    @GetMapping(value = "/{number}")
    public ResponseEntity<Manufacture> findByNumber(@PathVariable Integer number){

        return ResponseEntity.ok((ManufactureService.findByNumber(number)));
    }

}

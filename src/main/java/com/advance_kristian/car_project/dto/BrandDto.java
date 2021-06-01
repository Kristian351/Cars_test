package com.advance_kristian.car_project.dto;

import com.advance_kristian.car_project.model.Manufacture;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrandDto {

    private String name;

    private Long id;

    private String model;

    private Set<Manufacture> manufactures;

}


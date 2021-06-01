package com.advance_kristian.car_project.dto;

import com.advance_kristian.car_project.model.Brand;
import com.advance_kristian.car_project.model.Engine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ManufactureDto extends Brand {

    private Long id;

    private Integer number;

    private Set<Engine> engines;
}

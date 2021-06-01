package com.advance_kristian.car_project.dto;

import com.advance_kristian.car_project.model.Brand;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarPriceDto {

    private Long brandId;

    private Money price;

    private Set<Brand> brands;

}

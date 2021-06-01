package com.advance_kristian.car_project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarPriceDto {

    private Long brandId;
    private Money price;

}

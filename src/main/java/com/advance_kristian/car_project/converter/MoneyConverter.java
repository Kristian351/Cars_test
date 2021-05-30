package com.advance_kristian.car_project.converter;

import org.joda.money.Money;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class MoneyConverter implements AttributeConverter<Money, String> {


    private String price;

    @Override
    public String convertToDatabaseColumn(Money money) {
        return money.toString();
    }

    @Override
    public Money convertToEntityAttribute(String s) {
        return Money.parse(price);
    }
}

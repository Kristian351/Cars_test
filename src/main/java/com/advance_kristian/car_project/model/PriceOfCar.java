package com.advance_kristian.car_project.model;

import com.advance_kristian.car_project.converter.MoneyConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "priceOfCars")
public class PriceOfCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Convert(converter = MoneyConverter.class)
    private Money price;

    @JoinColumn
    @ManyToMany
    private Set<Brand> brands;

    @JoinColumn(name = "yearModel_id")
    @ManyToMany
    private YearModel yearModel;

    @Lob
    private String description;



}

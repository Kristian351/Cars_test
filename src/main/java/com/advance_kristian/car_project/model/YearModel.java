package com.advance_kristian.car_project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "yearModels")
public class YearModel {

    public static Long getId;
    public static Integer getNumber;
    public static Integer getString;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer number;


    @ManyToMany
    @JoinColumn(name = "brand_id")
    private Brand brand;
}

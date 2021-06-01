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
@Table(name = "manufactures")
public class Manufacture {

    public static Long getId;
    public static Integer getNumber;
    public static Integer getString;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Integer number;


    @ManyToMany
    @JoinColumn(name = "brand_id")
    private Brand brand;
}

package com.advance_kristian.car_project.model;

import javax.persistence.*;


@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
}


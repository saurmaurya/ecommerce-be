package org.satcomm.ecommerce.entity;

import jakarta.persistence.*;

@Entity
//@Table(name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private String Description;

    private Integer quantity;
}

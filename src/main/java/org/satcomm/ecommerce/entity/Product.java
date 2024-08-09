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

    public Product(Long id, String name, Double price, String description, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        Description = description;
        this.quantity = quantity;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return Description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

package org.satcomm.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @GetMapping("/")
    public String listProduct() {
        return "Hello";
    }

    @PostMapping("/")
    public String createProduct() {
        return "Hello";
    }
}

package org.satcomm.ecommerce.controller;

import org.satcomm.ecommerce.entity.Product;
import org.satcomm.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }
}

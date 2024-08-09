package org.satcomm.ecommerce;

import org.satcomm.ecommerce.entity.Product;
import org.satcomm.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Samsung S24", 123999.0, "An android mobile device.", 10));
            productService.save(new Product(2L, "Samsung S23", 32999.0, "An android mobile device.", 10));
            productService.save(new Product(3L, "Nokia 3300", 2999.0, "An android mobile device.", 10));
            productService.save(new Product(4L, "Nothing Phone 2a", 28999.0, "An android mobile device by Nothing.", 10));
            productService.save(new Product(5L, "Oneplus 9T", 23999.0, "An android mobile device.", 10));
            productService.save(new Product(6L, "Iphone 14", 63999.0, "An android mobile device.", 10));
        };
    }

}

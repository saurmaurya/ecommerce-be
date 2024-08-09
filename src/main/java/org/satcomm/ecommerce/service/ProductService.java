package org.satcomm.ecommerce.service;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.satcomm.ecommerce.entity.Product;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ProductService {
    @NotNull  Iterable<Product> getAllProducts();
    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id);
    Product save(Product product);
}

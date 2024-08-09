package org.satcomm.ecommerce.service;

import jakarta.transaction.Transactional;
import org.satcomm.ecommerce.entity.Product;
import org.satcomm.ecommerce.exception.ResourceNotFoundException;
import org.satcomm.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@Transactional
@Profile("dev")
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll().stream().filter(product -> product.getId() != 2.0).collect(Collectors.toList());
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}

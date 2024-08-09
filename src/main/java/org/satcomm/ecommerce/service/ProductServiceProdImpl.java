//package org.satcomm.ecommerce.service;
//
//import jakarta.transaction.Transactional;
//import org.satcomm.ecommerce.entity.Product;
//import org.satcomm.ecommerce.exception.ResourceNotFoundException;
//import org.satcomm.ecommerce.repository.ProductRepository;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Service;
//
//@Service
//@Transactional
//@Profile("prod")
//public class ProductServiceProdImpl implements ProductService{
//    private ProductRepository productRepository;
//
//    public ProductServiceProdImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public Iterable<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    @Override
//    public Product getProduct(long id) {
//        return productRepository
//                .findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
//    }
//
//    @Override
//    public Product save(Product product) {
//        return productRepository.save(product);
//    }
//}

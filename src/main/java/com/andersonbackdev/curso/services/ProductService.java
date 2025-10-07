package com.andersonbackdev.curso.services;


import com.andersonbackdev.curso.entities.Product;
import com.andersonbackdev.curso.entities.User;
import com.andersonbackdev.curso.repositories.ProductRepository;
import com.andersonbackdev.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();

    }
}

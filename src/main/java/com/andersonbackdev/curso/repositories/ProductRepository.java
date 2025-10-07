package com.andersonbackdev.curso.repositories;

import com.andersonbackdev.curso.entities.Product;
import com.andersonbackdev.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

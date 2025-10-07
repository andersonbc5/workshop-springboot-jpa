package com.andersonbackdev.curso.services;


import com.andersonbackdev.curso.entities.Category;
import com.andersonbackdev.curso.entities.User;
import com.andersonbackdev.curso.repositories.CategoryRepository;
import com.andersonbackdev.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();

    }
}

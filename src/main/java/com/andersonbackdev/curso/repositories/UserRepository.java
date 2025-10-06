package com.andersonbackdev.curso.repositories;

import com.andersonbackdev.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

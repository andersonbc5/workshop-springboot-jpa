package com.andersonbackdev.curso.repositories;

import com.andersonbackdev.curso.entities.Order;
import com.andersonbackdev.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

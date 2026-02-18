package com.treino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

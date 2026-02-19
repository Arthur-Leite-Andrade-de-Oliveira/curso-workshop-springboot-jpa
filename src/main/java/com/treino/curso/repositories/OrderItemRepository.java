package com.treino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.curso.entities.OrderItem;
import com.treino.curso.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}

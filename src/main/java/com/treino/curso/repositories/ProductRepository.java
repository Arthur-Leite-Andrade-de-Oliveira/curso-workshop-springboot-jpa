package com.treino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

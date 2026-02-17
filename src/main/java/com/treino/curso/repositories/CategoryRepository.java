package com.treino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

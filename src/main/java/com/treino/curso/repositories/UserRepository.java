package com.treino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

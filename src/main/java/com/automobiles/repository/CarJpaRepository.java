package com.automobiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.automobiles.entity.Car;

public interface CarJpaRepository extends JpaRepository<Car, Integer>{

}

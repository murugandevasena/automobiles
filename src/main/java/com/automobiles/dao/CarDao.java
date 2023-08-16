package com.automobiles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.automobiles.entity.Car;
import com.automobiles.repository.CarJpaRepository;

@Repository
public class CarDao {

	@Autowired
	CarJpaRepository carJpaRepository;
	public String insertOne(Car car) {
		// TODO Auto-generated method stub
		carJpaRepository.save(car);
		return "Data Saved successfully";
	}
	
	public String insertMany(List<Car> car) {
		// TODO Auto-generated method stub
		carJpaRepository.saveAll(car);
		return "Datas saved/updated successfully";
	}

	public Car getOneById(int id) {
		// TODO Auto-generated method stub
		return carJpaRepository.findById(id).get();
	}

	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return carJpaRepository.findAll();
	}

	public String getAfterDeleteById(int id) {
		// TODO Auto-generated method stub
		 carJpaRepository.deleteById(id);
		 return "Delete successfully";
	}
	
}

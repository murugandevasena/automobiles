package com.automobiles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.automobiles.entity.Bike;
import com.automobiles.repository.BikeRepository;

@Repository
public class BikeDao {
@Autowired
BikeRepository bikeRepository;
	public String setBike(Bike bike) {
		// TODO Auto-generated method stub
		bikeRepository.save(bike);
		return "Bike details saved successfully";
	}
	public String setBikeMany(List<Bike> bike) {
		// TODO Auto-generated method stub
		bikeRepository.saveAll(bike);
		return "All bike details saved successfully";
	}
	public List<Bike> getBikeAll() {
		// TODO Auto-generated method stub
		return bikeRepository.findAll();
	}
	public Bike getBikeById(int id) {
		// TODO Auto-generated method stub
		return bikeRepository.findById(id).get();
	}
	public List<Bike> getBikeByBrand(String brand) {
		// TODO Auto-generated method stub
		return bikeRepository.getBikeByBrand(brand);
	}
	public List<Bike> getBikeByPrice(int price) {
		// TODO Auto-generated method stub
		return bikeRepository.getBikeByPrice(price);
	}
	public List<Bike> getBikeBypriceRange(int price, int price1) {
		// TODO Auto-generated method stub
		return bikeRepository.getBikeByPriceRange(price,price1);
	}
	public List<Bike> getBikeByMax() {
		// TODO Auto-generated method stub
		return bikeRepository.getBikeByMax();
	}
	
	public List<Bike> getBikeByMin() {
		// TODO Auto-generated method stub
		return bikeRepository.getBikeByMin();
	}
	public List<Bike> getBikeByRating() {
		// TODO Auto-generated method stub
		return bikeRepository.getBikeByRating();
	}
	public List<Bike> getBikeByStartsWith(String st) {
		// TODO Auto-generated method stub
		return bikeRepository.getBikeByStartsWith(st);
	}
	

}

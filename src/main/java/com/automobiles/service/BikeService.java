package com.automobiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobiles.dao.BikeDao;
import com.automobiles.entity.Bike;

@Service
public class BikeService {

	@Autowired
	BikeDao bikeDao;
	public String setBike(Bike bike) {
		// TODO Auto-generated method stub
		return bikeDao.setBike(bike);
	}
	public String setBikeMany(List<Bike> bike) {
		// TODO Auto-generated method stub
		return bikeDao.setBikeMany(bike);
	}
	public List<Bike> getBikeAll() {
		// TODO Auto-generated method stub
		return bikeDao.getBikeAll();
	}
	public Bike getBikeById(int id) {
		// TODO Auto-generated method stub
		return bikeDao.getBikeById(id);
	}
	public List<Bike> getBikeByBrand(String brand) {
		// TODO Auto-generated method stub
		return bikeDao.getBikeByBrand(brand);
	}
	public List<Bike> getBikeByPrice(int price) {
		// TODO Auto-generated method stub
		return bikeDao.getBikeByPrice(price);
	}
	public List<Bike> getBikeByPriceRange(int price, int price1) {
		// TODO Auto-generated method stub
		return bikeDao.getBikeBypriceRange(price,price1);
	}
	public List<Bike> getBikeByMax() {
		// TODO Auto-generated method stub
		return bikeDao.getBikeByMax();
	}
	
	public List<Bike> getBikeByMin() {
		// TODO Auto-generated method stub
		return bikeDao.getBikeByMin();
	}
	public List<Bike> getBikeByRating() {
		// TODO Auto-generated method stub
		return bikeDao.getBikeByRating();
	}
	public List<Bike> getBikeByStartsWith(String st) {
		// TODO Auto-generated method stub
		return bikeDao.getBikeByStartsWith(st);
	}
	

}

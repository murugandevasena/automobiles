package com.automobiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.entity.Bike;
import com.automobiles.service.BikeService;

@RestController
@RequestMapping(value="/bike")
public class BikeController {
	@Autowired
	BikeService bikeService;
	
	@PostMapping (value ="/setBike")
	public String setBike(@RequestBody Bike bike) {
		return bikeService.setBike(bike);
	}
	
	@PostMapping (value ="/setBikeMany")
	public String setBikeMany(@RequestBody List<Bike> bike) {
		return bikeService.setBikeMany(bike);
	}
	
	@GetMapping (value ="/getBikeAll")
	public List<Bike> getBikeAll() {
		return bikeService.getBikeAll();
	}
	
	@GetMapping (value ="/getBikeById/{id}")
	public Bike getBikeById(@PathVariable int id) {
		return bikeService.getBikeById(id);
	}
	
	@GetMapping (value ="/getBikeByBrand/{name}")
	public List<Bike> getBikeByBrand(@PathVariable("name") String brand) {
		return bikeService.getBikeByBrand(brand);
	}
	
	@GetMapping (value ="/getBikeByPrice/{p}")
	public List<Bike> getBikeByPrice(@PathVariable("p") int price) {
		return bikeService.getBikeByPrice(price);
	}
	
	@GetMapping (value ="/getBikeByPriceRange/{p}/{p1}")
	public List<Bike> getBikeByPriceRange(@PathVariable("p") int price,@PathVariable ("p1") int price1 ) {
		return bikeService.getBikeByPriceRange(price,price1);
	}
	
	@GetMapping (value ="/getBikeByMax")
	public List<Bike> getBikeByMax() {
		return bikeService.getBikeByMax();
	}
	
	@GetMapping (value ="/getBikeByMin")
	public List<Bike> getBikeByMin() {
		return bikeService.getBikeByMin();
	}
	
	@GetMapping (value ="/getBikeByRating")
	public List<Bike> getBikeByrating() {
		return bikeService.getBikeByRating();
	}
	
	@GetMapping (value ="/getBikeStartsWith/{start}")
	public List<Bike> getBikeByStartsWith(@PathVariable ("start") String st) {
		return bikeService.getBikeByStartsWith(st);
	}
	
	
 
} 

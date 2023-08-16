package com.automobiles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.automobiles.entity.Car;
import com.automobiles.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	CarService carService;
	
	@PostMapping(value ="/insertOne")
	public String insertOne(@RequestBody Car car)
	{
		return carService.insertOne(car);
	}
	
	@PostMapping(value ="/insertMany")
	public String insertMany(@RequestBody List<Car> car)
	{
		return carService.insertMany(car);
	}
	
	@GetMapping(value ="/getOneById/{id}")
	public Car getOneById(@PathVariable int id)
	{
		return carService.getOneById(id);
	}
	
	@GetMapping(value ="/getAll")
	public List<Car> getAll()
	{
		return carService.getAll();
	}
	
	@GetMapping(value ="/getByModel/{model}")
	public List<Car> getByModel(@PathVariable ("model") int model)
	{
		return carService.getByModel(model);
	}
	
	@GetMapping(value ="/getByBrandStartLetter/{id}")
	public List<Car> getBrandStartLetter(@PathVariable("id") String brandLetter)
	{
		return carService.getBrandStartLetter(brandLetter);
	}
	
	@GetMapping(value ="/getRangeOfYears/{id1}/{id2}")
	public List<Car> getRangeOfYears(@PathVariable("id1") int year1,@PathVariable("id2") int year2)
	{
		return carService.getRangeOfYears(year1,year2);
	}
	
	@GetMapping(value ="/getIncreaseRatingByBrand/{name}")
	public String getIncreaseRatingByBrand(@PathVariable("name") String brand)
	{
		return carService.getIncreaseRatingByBrand(brand);
	}
	
	@GetMapping(value ="/getMaxModel")
	public Car getMaxModel()
	{
		return carService.getMaxModel();
	}
	
	@GetMapping(value ="/getMinNoPlate")
	public Car getMinModel()
	{
		return carService.getMinModel();
	}
	
	@DeleteMapping(value ="/deleteById/{id}")
	public String getAfterDeleteById(@PathVariable int id)
	{
		return carService.getAfterDeleteById(id);
	}
	
	@PutMapping(value ="/updateBrandUpperCase")
	public List<String> updateBrandUpperCase()
	{
		return carService.updateBrandUpperCase();
	}
	
	@PutMapping(value ="/updateBrandUpperCaseToTable")
	public String updateBrandUpperCaseToTable()
	{
		return carService.updateBrandUpperCaseToTable();
	}
	
	@PutMapping(value ="/updateColourUpperCaseToTable")
	public String updateColourUpperCaseToTable()
	{
		return carService.updateColourUpperCaseToTable();
	}
	
	@GetMapping(value ="/conCat")
	public List<Car> conCat()
	{
		return carService.conCat();
	}
	
	@GetMapping(value ="/removeDuplicateColour")
	public List<String> removeDuplicateColour()
	{
		return carService.removeDuplicateColour();
	}
	
	
}

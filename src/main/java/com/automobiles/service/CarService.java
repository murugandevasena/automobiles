package com.automobiles.service;

import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automobiles.dao.CarDao;
import com.automobiles.entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao carDao;
	public String insertOne(Car car) {
		// TODO Auto-generated method stub
		return carDao.insertOne(car);
	}
	

	public String insertMany(List<Car> car) {
		// TODO Auto-generated method stub
		return carDao.insertMany(car);
	}


	public Car getOneById(int id) {
		// TODO Auto-generated method stub
		return carDao.getOneById(id);
	}


	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return carDao.getAll();
	}


	public List<Car> getByModel(int model) {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		List<Car> l2 = l1.stream().filter(x->x.getModel()==model).collect(Collectors.toList());
		return l2;
	}


	public List<Car> getBrandStartLetter(String brandLetter) {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		List<Car> l3 = l1.stream().filter(x->x.getBrand().startsWith(brandLetter)).collect(Collectors.toList());
		return l3;
	}


	public List<Car> getRangeOfYears(int year1, int year2) {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		List<Car> l4 = l1.stream().filter(x->x.getModel()>year1 && x.getModel()<=year2).collect(Collectors.toList());
		return l4;
	}


	public String getIncreaseRatingByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		l1.stream().filter(x->x.getBrand().equals(brand)).forEach(y->{
			y.setRating(y.getRating()+1);
		});
		return insertMany(l1) ;
	}


	public Car getMaxModel() {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		Car c = l1.stream().max(Comparator.comparingInt(Car::getModel)).get();
		return c;
	}


	public Car getMinModel() {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		Car c1 = l1.stream().min(Comparator.comparingInt(Car::getNoPlate)).get();
		return c1;
	}


	public String getAfterDeleteById(int id) {
		// TODO Auto-generated method stub
		return  carDao.getAfterDeleteById(id);
	}


	public List<String> updateBrandUpperCase() {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		List<String> l4 = l1.stream().map(y->y.getBrand().toUpperCase()).collect(Collectors.toList());
		return l4;
	}


	public String updateBrandUpperCaseToTable() {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		List<Car> l5= l1.stream().peek(x->x.setBrand(x.getBrand().toUpperCase())).collect(Collectors.toList());
		return insertMany(l5);
	}


	public String updateColourUpperCaseToTable() {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		List<Car> l6 = l1.stream().peek(x->x.setColour(x.getColour().toUpperCase())).collect(Collectors.toList());
		return insertMany(l6);
	}


	public List<Car> conCat() {
		// TODO Auto-generated method stub
		List<Car> l1= getAll();
		List<Car> l7 = l1.stream().peek(x->x.setBrand(x.getBrand()+" "+x.getColour())).collect(Collectors.toList());
		return l7;
	}


	public List<String> removeDuplicateColour() {
		List<Car> l1= getAll();
		List<String> l8 = l1.stream().map(x->x.getBrand()).distinct().collect(Collectors.toList());
		// TODO Auto-generated method stub
		return l8;
	}
	
	
	
	
	

//	l9.forEach(x->{x.setPrice(x.getPrice()+10000) ;
//	});
//	public List<Car> getByModel(int model) {
//		// TODO Auto-generated method stub
//		return carDao.getBymodel(model);
//	}
}

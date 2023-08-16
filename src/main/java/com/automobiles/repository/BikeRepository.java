package com.automobiles.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.automobiles.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{
	@Query(value = "select * from bike_data where brand = ?",nativeQuery=true)
	List<Bike> getBikeByBrand(String brand);
	
	@Query(value="select * from bike_data where price=?",nativeQuery=true)
	List<Bike> getBikeByPrice(int price);
	
	@Query(value="select * from bike_data where price between ? and ?",nativeQuery=true)
	List<Bike> getBikeByPriceRange(int price, int price1);
	
	@Query(value = "select * from bike_data where price = (select max(price) from bike_data)",nativeQuery=true)
	List<Bike> getBikeByMax();
	
	@Query(value = "select * from bike_data where price = (select min(price) from bike_data)",nativeQuery=true)
	List<Bike> getBikeByMin();
	
	@Query(value = "select * from bike_data order by rating asc",nativeQuery=true)
	List<Bike> getBikeByRating();

	@Query(value = "select * from bike_data where brand like %?% ",nativeQuery=true)
	List<Bike> getBikeByStartsWith(String st);
	
	
}

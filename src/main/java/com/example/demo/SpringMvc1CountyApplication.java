package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;

@SpringBootApplication
public class SpringMvc1CountyApplication implements CommandLineRunner{

	@Autowired
	private CountryRepository countryRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMvc1CountyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		countryRepo.save(new Country("America", "Washington", 5000000));
		countryRepo.save(new Country("Canada", "Ottawa", 3000000));
		countryRepo.save(new Country("Mexico", "Mexico City", 2000000));
	}

}

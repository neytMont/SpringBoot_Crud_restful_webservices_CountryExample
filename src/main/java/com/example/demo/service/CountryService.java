package com.example.demo.service;

import java.util.*;
import com.example.demo.entity.*;
import com.example.demo.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	@Autowired
	CountryRepository countryRepo;
	
	public List<Country> getCountryList(){
		return countryRepo.findAll();
	}
	
	public Country getCountry(String countryName) {
		return countryRepo.findById(countryName).get();
	}
	
	public void saveCountry(Country c) {
		countryRepo.save(c);
	}
	

}


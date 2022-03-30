package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	private String countryName;
	

	private String countryCapital;
	
	private int countryPopulation;
	
	// Constructors
	public Country() {}
	
	public Country(String name, String capital, int population) {
		this.countryName = name;
		this.countryCapital = capital;
		this.countryPopulation = population;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	public int getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(int countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
	
	
}

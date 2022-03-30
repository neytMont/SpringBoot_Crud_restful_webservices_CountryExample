package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;

@Controller
public class MainController {
	@Autowired
	CountryService countryService;
	
	@RequestMapping("/")
	public String listCountry(Model model) {
		List<Country> list = countryService.getCountryList();
		model.addAttribute("countries",list);
		return "index";
	}
	
	@RequestMapping("/countries/{countryName}")
	public String specificCountry(@PathVariable(name="countryName") String countryName, Model model) {
		Country country = countryService.getCountry(countryName);
		model.addAttribute("countrys", country);
		System.out.println(country.getCountryCapital());
		System.out.println(country.getCountryPopulation());
		System.out.println(model);
		return "countries";
	}

	
	
	@RequestMapping("/update/{countryName}")
	public ModelAndView updateCountryPage(@PathVariable(name="countryName") String countryName) {
		ModelAndView mav = new ModelAndView("update_country");
		Country country = countryService.getCountry(countryName);
		mav.addObject("country", country);
		return mav;
	}
	
	@RequestMapping("/adding")
	public String addingCountryPage(Model model) {
		Country c = new Country();
		model.addAttribute("country", c);
		return "add_country";
	}
	
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	public String saveCountry(@ModelAttribute("country") Country c) {
		countryService.saveCountry(c);
		return "redirect:/";
	}
	
}


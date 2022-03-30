package com.example.demo.repository;

import com.example.demo.entity.Country;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String>{

}

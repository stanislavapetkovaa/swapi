package com.swapi.swapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swapi.swapi.model.Planet;

@Repository
public interface PlanetRepository extends CrudRepository<Planet,Long> {

    

    
}

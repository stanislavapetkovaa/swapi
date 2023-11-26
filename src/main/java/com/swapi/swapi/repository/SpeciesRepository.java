package com.swapi.swapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swapi.swapi.model.Species;

@Repository
public interface SpeciesRepository extends CrudRepository<Species,Long> {

    
} 

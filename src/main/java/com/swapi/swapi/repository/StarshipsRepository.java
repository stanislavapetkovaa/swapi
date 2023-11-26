package com.swapi.swapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swapi.swapi.model.Starships;

@Repository
public interface StarshipsRepository extends CrudRepository<Starships,Long> {
    
}

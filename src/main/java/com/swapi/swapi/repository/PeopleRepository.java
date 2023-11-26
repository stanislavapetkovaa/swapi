package com.swapi.swapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swapi.swapi.model.People;
@Repository
public interface PeopleRepository extends CrudRepository<People,Long>{
    
}

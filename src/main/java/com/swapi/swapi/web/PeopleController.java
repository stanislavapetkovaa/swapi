package com.swapi.swapi.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swapi.swapi.model.People;
import com.swapi.swapi.repository.FilmRepository;
import com.swapi.swapi.repository.PeopleRepository;
import com.swapi.swapi.repository.PlanetRepository;
import com.swapi.swapi.repository.SpeciesRepository;
import com.swapi.swapi.repository.StarshipsRepository;

@RestController
public class PeopleController {
    @Autowired
    PeopleRepository peopleRepository;
    @Autowired
    FilmRepository filmRepository;
    @Autowired
    SpeciesRepository species;
    @Autowired
    StarshipsRepository starshipsRepository;
    @Autowired
    PlanetRepository planetRepository;


    @PostMapping(value="/people")
    private People creaPerson(@RequestBody People person){


        return peopleRepository.save(person);
    }

        @GetMapping(value = "/people/{id}")
    private Optional<People> getPersonById(@PathVariable Long id){
        return peopleRepository.findById(id);
    }

    @GetMapping(value = "/people")
    public List<People> getAll(){
      
        return (List) peopleRepository.findAll();

    }

    
}

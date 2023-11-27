package com.swapi.swapi.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swapi.swapi.model.People;
import com.swapi.swapi.model.Planet;
import com.swapi.swapi.repository.FilmRepository;
import com.swapi.swapi.repository.PeopleRepository;
import com.swapi.swapi.repository.PlanetRepository;
import com.swapi.swapi.repository.SpeciesRepository;
import com.swapi.swapi.repository.StarshipsRepository;

@RestController
public class PlanetContoller {
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


        @PostMapping(value="/planet")
    private Planet creaPlanet(@RequestBody Planet planet){


        return planetRepository.save(planet);
    }  

           @GetMapping(value = "/planet/{id}")
           @ResponseBody
    private Optional<Planet> getPersonById(@PathVariable Long id){
        return planetRepository.findById(id);
    }


    
    
    
}

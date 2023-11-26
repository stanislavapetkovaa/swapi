package com.swapi.swapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    
    
    
}

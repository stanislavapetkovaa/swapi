package com.swapi.swapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swapi.swapi.model.People;
import com.swapi.swapi.model.Starships;
import com.swapi.swapi.repository.StarshipsRepository;

@RestController
public class StarshipsController {
    @Autowired
    StarshipsRepository starshipsRepository;

        @PostMapping(value="/starships")
    private Starships creaPerson(@RequestBody Starships starships){


        return starshipsRepository.save(starships);
    }

    
}

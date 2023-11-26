package com.swapi.swapi.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Films {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String opening_crawl;
    private String director;
    private String producer;
    private LocalDate release_date;
    private LocalDate createdAt;
    private LocalDate edited;

    @ManyToMany(mappedBy = "films")
    private List<People> characters;

    @ManyToMany(mappedBy = "films")
    private List<Planet> planets;

      @ManyToMany(mappedBy = "films")
    private List<Species> species;


    
    
}

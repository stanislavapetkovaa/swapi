package com.swapi.swapi.model;

import java.util.List;
import java.util.Set;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Species {
    @Id
    @GeneratedValue
    private Long id;
    private String classification;
    private String designation;
    private Integer average_height;
    private String skin_colors;
    private String hair_colors;
    private String eye_colors;
    private Integer avarage_lifespan;

    @OneToMany(mappedBy = "species")
    private Set<People> people;

       @ManyToMany
    @JoinTable(name="species_films", joinColumns = @JoinColumn(name="species_id"),
    inverseJoinColumns =  @JoinColumn(name="film_id"))
    private List<Films> films;


     



    
}

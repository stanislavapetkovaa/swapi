package com.swapi.swapi.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Planet {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer rotation_period;
    private Integer orbital_period;
    private String climate;
    private Integer diameter;
    private String gravity;
    private String terrain;
    private Integer surface_water;
    private Long population;
   
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Europe/Zagreb")
     private LocalDate createdAt;
     @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Europe/Zagreb")
    private LocalDate editAt;

    @ManyToMany
    @JoinTable(name="planets_films", joinColumns = @JoinColumn(name="planet_id"),
    inverseJoinColumns =  @JoinColumn(name="film_id"))
    private List<Films> films;

      @OneToMany(mappedBy = "planet")
private Set<People> residents;

 
    
}

package com.swapi.swapi.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;

@Entity
public class Starships {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String model;
    private String manifacturer;
    private Long cost_in_credits;
    private String max_atmosphering_speed;
    private Long crew;
    private Long cargo_capacity;
    private String consumables;
    private  Double hyperdrive_rating;
    private Integer MGLT;
    private Long passengers;
    private String starship_class;
     private LocalDate createdAt;
    private LocalDate editAt;


    @ManyToMany(mappedBy = "starships")
    private List<People> pilots;
    
}

package com.swapi.swapi.model;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class People {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long height;
    private Double mass;
    private String hair_color;
    private String birth_year;
    private LocalDate createdAt;
    private LocalDate editAt;
    private String gender;

    

    @ManyToMany
    @JoinTable(name="person_films", joinColumns = @JoinColumn(name="people_id"),
    inverseJoinColumns =  @JoinColumn(name="film_id"))
    private List<Films> films;

    @ManyToOne
    @JoinColumn(name="species_id")
   private Species species;

   


 


   @ManyToMany
   @JoinTable(name="person_starships",joinColumns = @JoinColumn(name = "people_id"),
   inverseJoinColumns = @JoinColumn(name = "starship_id"))
   private List<Starships> starships;



   @ManyToOne 
@JoinColumn(name = "planet_id") 
private Planet planet;




   
 





    
}

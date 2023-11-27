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

    

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    @ManyToMany
    @JoinTable(name="person_films", joinColumns = @JoinColumn(name="people_id"),
    inverseJoinColumns =  @JoinColumn(name="film_id"))
    private List<Films> films;
    

    @ManyToOne
    @JoinColumn(name="species_id")
   private Species species;

    


 


   public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public Long getHeight() {
        return height;
    }



    public void setHeight(Long height) {
        this.height = height;
    }



    public Double getMass() {
        return mass;
    }



    public void setMass(Double mass) {
        this.mass = mass;
    }



    public String getHair_color() {
        return hair_color;
    }



    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }



    public String getBirth_year() {
        return birth_year;
    }



    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }



    public LocalDate getCreatedAt() {
        return createdAt;
    }



    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }



    public LocalDate getEditAt() {
        return editAt;
    }



    public void setEditAt(LocalDate editAt) {
        this.editAt = editAt;
    }



    public String getGender() {
        return gender;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public List<Films> getFilms() {
        return films;
    }



    public void setFilms(List<Films> films) {
        this.films = films;
    }



    public Species getSpecies() {
        return species;
    }



    public void setSpecies(Species species) {
        this.species = species;
    }



    public List<Starships> getStarships() {
        return starships;
    }



    public void setStarships(List<Starships> starships) {
        this.starships = starships;
    }



    public Planet getPlanet() {
        return planet;
    }



    public void setPlanet(Planet planet) {
        this.planet = planet;
    }



@ManyToMany
   @JoinTable(name="person_starships",joinColumns = @JoinColumn(name = "people_id"),
   inverseJoinColumns = @JoinColumn(name = "starship_id"))
   private List<Starships> starships;



   @ManyToOne 
@JoinColumn(name = "planet_id") 
private Planet planet;




   
 





    
}

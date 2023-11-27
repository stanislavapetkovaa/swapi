package com.swapi.swapi.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getOpening_crawl() {
      return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
      this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
      return director;
    }

    public void setDirector(String director) {
      this.director = director;
    }

    public String getProducer() {
      return producer;
    }

    public void setProducer(String producer) {
      this.producer = producer;
    }

    public LocalDate getRelease_date() {
      return release_date;
    }

    public void setRelease_date(LocalDate release_date) {
      this.release_date = release_date;
    }

    public LocalDate getCreatedAt() {
      return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
      this.createdAt = createdAt;
    }

    public LocalDate getEdited() {
      return edited;
    }

    public void setEdited(LocalDate edited) {
      this.edited = edited;
    }

    public List<People> getCharacters() {
      return characters;
    }

    public void setCharacters(List<People> characters) {
      this.characters = characters;
    }

    public List<Planet> getPlanets() {
      return planets;
    }

    public void setPlanets(List<Planet> planets) {
      this.planets = planets;
    }

    public List<Species> getSpecies() {
      return species;
    }

    public void setSpecies(List<Species> species) {
      this.species = species;
    }

    private LocalDate release_date;
    private LocalDate createdAt;
    private LocalDate edited;

    @ManyToMany(mappedBy = "films")
    private List<People> characters;

    @ManyToMany(mappedBy = "films")
    private List<Planet> planets;

      @ManyToMany(mappedBy = "films")
    private List<Species> species;

      @ManyToMany
    @JoinTable(name="films_starships", joinColumns = @JoinColumn(name="films_id"),
    inverseJoinColumns =  @JoinColumn(name="starships_id"))
    private List<Starships> starships;


    
    
}

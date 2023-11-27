package com.swapi.swapi.model;

import java.util.List;
import java.util.Set;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Species {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getAverage_height() {
        return average_height;
    }

    public void setAverage_height(Integer average_height) {
        this.average_height = average_height;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public Integer getAvarage_lifespan() {
        return avarage_lifespan;
    }

    public void setAvarage_lifespan(Integer avarage_lifespan) {
        this.avarage_lifespan = avarage_lifespan;
    }

    public Set<People> getPeople() {
        return people;
    }

    public void setPeople(Set<People> people) {
        this.people = people;
    }

    public List<Films> getFilms() {
        return films;
    }

    public void setFilms(List<Films> films) {
        this.films = films;
    }

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

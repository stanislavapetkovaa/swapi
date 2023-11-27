package com.swapi.swapi.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PostLoad;
import jakarta.persistence.Transient;
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
    private List<People> people;

    @Transient
    private Set<Long> pilots;

    @ManyToMany(mappedBy = "starships")
    public List<Films> films;

      @PostLoad
    private void postLoad() {
        pilots = people.stream().map(People::getId).collect(Collectors.toSet());
    }


    public Long getId() {
        return id;
    }


    public void setPilots(Set<Long> pilots) {
        this.pilots = pilots;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getManifacturer() {
        return manifacturer;
    }


    public void setManifacturer(String manifacturer) {
        this.manifacturer = manifacturer;
    }


    public Long getCost_in_credits() {
        return cost_in_credits;
    }


    public void setCost_in_credits(Long cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }


    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }


    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }


    public Long getCrew() {
        return crew;
    }


    public void setCrew(Long crew) {
        this.crew = crew;
    }


    public Long getCargo_capacity() {
        return cargo_capacity;
    }


    public void setCargo_capacity(Long cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }


    public String getConsumables() {
        return consumables;
    }


    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }


    public Double getHyperdrive_rating() {
        return hyperdrive_rating;
    }


    public void setHyperdrive_rating(Double hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }


    public Integer getMGLT() {
        return MGLT;
    }


    public void setMGLT(Integer mGLT) {
        MGLT = mGLT;
    }


    public Long getPassengers() {
        return passengers;
    }


    public void setPassengers(Long passengers) {
        this.passengers = passengers;
    }


    public String getStarship_class() {
        return starship_class;
    }


    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
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


    public List<People> getPilots() {
        return pilots;
    }


    public void setPilots(List<People> pilots) {
        this.pilots = pilots;
    }


    
}

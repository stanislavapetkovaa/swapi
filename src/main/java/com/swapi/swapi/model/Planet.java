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
   
    
     public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Integer getRotation_period() {
      return rotation_period;
    }

    public void setRotation_period(Integer rotation_period) {
      this.rotation_period = rotation_period;
    }

    public Integer getOrbital_period() {
      return orbital_period;
    }

    public void setOrbital_period(Integer orbital_period) {
      this.orbital_period = orbital_period;
    }

    public String getClimate() {
      return climate;
    }

    public void setClimate(String climate) {
      this.climate = climate;
    }

    public Integer getDiameter() {
      return diameter;
    }

    public void setDiameter(Integer diameter) {
      this.diameter = diameter;
    }

    public String getGravity() {
      return gravity;
    }

    public void setGravity(String gravity) {
      this.gravity = gravity;
    }

    public String getTerrain() {
      return terrain;
    }

    public void setTerrain(String terrain) {
      this.terrain = terrain;
    }

    public Integer getSurface_water() {
      return surface_water;
    }

    public void setSurface_water(Integer surface_water) {
      this.surface_water = surface_water;
    }

    public Long getPopulation() {
      return population;
    }

    public void setPopulation(Long population) {
      this.population = population;
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

    private LocalDate createdAt;
    private LocalDate editAt;

    @ManyToMany
    @JoinTable(name="planets_films", joinColumns = @JoinColumn(name="planet_id"),
    inverseJoinColumns =  @JoinColumn(name="film_id"))
    private List<Films> films;

      @OneToMany(mappedBy = "planet")
private Set<People> residents;

 
    
}

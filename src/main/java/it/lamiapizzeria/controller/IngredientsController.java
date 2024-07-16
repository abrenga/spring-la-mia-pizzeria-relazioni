package it.lamiapizzeria.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import it.lamiapizzeria.model.Ingredients;

public interface  IngredientsController extends JpaRepository<Ingredients, Integer> {
    
}

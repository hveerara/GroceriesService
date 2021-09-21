package com.neuron.groceries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neuron.groceries.model.Groceries;

public interface GroceriesRepository extends JpaRepository<Groceries, Integer> {
}

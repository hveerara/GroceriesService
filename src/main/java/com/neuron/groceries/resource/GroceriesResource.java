package com.neuron.groceries.resource;

import com.neuron.groceries.model.Groceries;
import com.neuron.groceries.repository.GroceriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping(value="/api/groceries")
public class GroceriesResource {

    @Autowired
    GroceriesRepository groceriesRepository;

    @GetMapping(value="/all")
    public List<Groceries> getAll() {
        return groceriesRepository.findAll();
    }

    @PostMapping(value="/create")
    public List<Groceries> persist(@RequestBody final Groceries groceries) {
        groceriesRepository.save(groceries);
        return groceriesRepository.findAll();
    }
}

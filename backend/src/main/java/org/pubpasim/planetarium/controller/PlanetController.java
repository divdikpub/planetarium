package org.pubpasim.planetarium.controller;

import java.util.List;

import org.pubpasim.planetarium.model.Planet;
import org.pubpasim.planetarium.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PlanetController {

    PlanetRepository repository;

    @Autowired
    public PlanetController(PlanetRepository repository) {
        this.repository = repository;
    }

    @GetMapping("planets")
    public List<Planet> getAll() {
        return repository.findAll();
    }
}

package org.pubpasim.planetarium.repository;

import org.pubpasim.planetarium.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {

}

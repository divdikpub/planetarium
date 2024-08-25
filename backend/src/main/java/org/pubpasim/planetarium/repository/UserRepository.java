package org.pubpasim.planetarium.repository;

import org.pubpasim.planetarium.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

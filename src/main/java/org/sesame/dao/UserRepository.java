package org.sesame.dao;

import org.sesame.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long>{
    AppUser findByUsername(String username);

}

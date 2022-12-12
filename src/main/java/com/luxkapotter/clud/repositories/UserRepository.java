package com.luxkapotter.clud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luxkapotter.clud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

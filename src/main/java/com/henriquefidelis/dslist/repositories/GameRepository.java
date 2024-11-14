package com.henriquefidelis.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquefidelis.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}

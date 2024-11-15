package com.henriquefidelis.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquefidelis.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}

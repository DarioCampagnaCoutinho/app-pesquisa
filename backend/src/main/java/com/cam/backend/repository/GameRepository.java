package com.cam.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cam.backend.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}

package com.cam.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cam.backend.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}

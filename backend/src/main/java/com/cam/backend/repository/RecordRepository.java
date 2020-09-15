package com.cam.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cam.backend.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}

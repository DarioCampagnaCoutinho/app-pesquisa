package com.cam.backend.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cam.backend.dto.RecordDTO;
import com.cam.backend.dto.RecordInsertDTO;
import com.cam.backend.entities.Game;
import com.cam.backend.entities.Record;
import com.cam.backend.repository.GameRepository;
import com.cam.backend.repository.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		entity = recordRepository.save(entity);
		return new RecordDTO(entity);
	}
}

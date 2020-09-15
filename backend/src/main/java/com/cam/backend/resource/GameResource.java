package com.cam.backend.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cam.backend.entities.Game;
import com.cam.backend.repository.GameRepository;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameRepository gameRepository;
	
	@GetMapping
	public ResponseEntity<List<Game>> listar(){
		return ResponseEntity.ok().body(gameRepository.findAll());
	}
}

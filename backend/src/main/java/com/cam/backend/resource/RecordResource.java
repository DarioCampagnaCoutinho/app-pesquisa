package com.cam.backend.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cam.backend.dto.RecordDTO;
import com.cam.backend.dto.RecordInsertDTO;
import com.cam.backend.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {

	@Autowired
	private RecordService recordService;
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		RecordDTO newDTO = recordService.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
}

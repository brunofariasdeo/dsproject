package com.devsuperior.dsproject.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsproject.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		Instant birthDate = Instant.parse("1994-09-18T00:00:00.63Z");
		list.add(new Client(1L, "Bruno", "0123456789", 1600.00, birthDate, 0));
		
		return ResponseEntity.ok().body(list);

	}
}

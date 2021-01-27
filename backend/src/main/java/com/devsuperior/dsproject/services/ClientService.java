package com.devsuperior.dsproject.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsproject.dto.ClientDTO;
import com.devsuperior.dsproject.entities.Client;
import com.devsuperior.dsproject.exceptions.EntityNotFoundException;
import com.devsuperior.dsproject.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();
		
		List<ClientDTO> listDTO = new ArrayList<>();
		for (Client cat : list) {
			listDTO.add(new ClientDTO(cat));
		}

		return listDTO;
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new ClientDTO(entity);
	}
}

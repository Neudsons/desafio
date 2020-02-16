package com.desafio.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.desafio.entities.Telefone;
import com.desafio.desafio.repositories.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository repository;
	
	public List<Telefone> findAll(){
		return repository.findAll();
	}
	
	public Telefone findById(Long id) {
		Optional<Telefone> obj = repository.findById(id);
		return obj.get();
	}
}

package com.cl1.palomino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl1.palomino.Entity.Autos;
import com.cl1.palomino.repository.AutosRepository;

@Service
public class AutosService {

	@Autowired
	private AutosRepository repo;
	
	public void registrar(Autos a) {
		repo.save(a);
	}
	
	public List<Autos> listarTodo(){
		return repo.findAll();
	}
	
	
}

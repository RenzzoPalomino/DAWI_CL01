package com.cl1.palomino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl1.palomino.Entity.Marca;
import com.cl1.palomino.repository.MarcaRepository;

@Service
public class MarcaService {
	@Autowired
	private MarcaRepository repo; //para el combo
	
	public List<Marca> listarTodo(){
		return repo.findAll();
	}
	
}

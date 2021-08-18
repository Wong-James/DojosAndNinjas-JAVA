package com.james.dojosandninjas.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.james.dojosandninjas.models.Dojo;
import com.james.dojosandninjas.repositories.DojoRepository;


@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	public Dojo updateDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public void deleteById(Long id) {
		dojoRepository.deleteById(id);
	}
}

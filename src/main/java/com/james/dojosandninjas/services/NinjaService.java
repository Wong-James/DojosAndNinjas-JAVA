package com.james.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.james.dojosandninjas.models.Ninja;
import com.james.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	public void deleteById(Long id) {
		ninjaRepository.deleteById(id);
	}

}

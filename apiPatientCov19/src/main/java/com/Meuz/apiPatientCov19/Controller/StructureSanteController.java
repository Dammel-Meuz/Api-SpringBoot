package com.Meuz.apiPatientCov19.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Meuz.apiPatientCov19.Entity.StructureSante;
import com.Meuz.apiPatientCov19.Repository.StructureSanterRepository;

@RestController
public class StructureSanteController {
	 @Autowired 
	private StructureSanterRepository structureSanterRepository;
	
	@GetMapping("/structure-santer")
	
	public List<StructureSante> liststructureSanter() {
		return structureSanterRepository.findAll();
		
	}
@GetMapping("/structure-santer/{id}")
	
	public Optional<StructureSante> structureSanter(@PathVariable(value="id") Long id) {
	
	var val = structureSanterRepository.findById(id);
	 if(!val.isPresent()) { 
		 return null;
	 }else {
		 return structureSanterRepository.findById(id);
	}
		
		
	}

@PostMapping("/structure-santer")
public StructureSante addstructureSanter(@RequestBody StructureSante santer ) {
	return structureSanterRepository.save(santer);
	
}
@DeleteMapping("/structure-santer/{id}")

public void deletestructureSanter(@PathVariable(value="id") Long id) {

var val = structureSanterRepository.findById(id);
 if(!val.isPresent()) { 
	 System.out.println("invalid id");
 }else {
	 structureSanterRepository.deleteById(id);
}
	
	
}
}

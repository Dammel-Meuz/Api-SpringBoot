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

import com.Meuz.apiPatientCov19.Entity.Structure;
import com.Meuz.apiPatientCov19.Entity.StructureSante;
import com.Meuz.apiPatientCov19.Repository.StructureRepository;

@RestController
public class StructureController {

	 @Autowired 
		private StructureRepository structureRepository;
		
		@GetMapping("/structure")
		
		public List<Structure> liststructure() {
			return structureRepository.findAll();
			
		}
		
		@GetMapping("/structure/{id}")
		
		public Optional<Structure> structure(@PathVariable(value="id") Long id) {
		
		var val = structureRepository.findById(id);
		 if(!val.isPresent()) { 
			 return null;
		 }else {
			 return structureRepository.findById(id);
		}
		}
		@PostMapping("/structure")
		public Structure addstructure(@RequestBody Structure structure ) {
			return structureRepository.save(structure);
			
		}
		@DeleteMapping("/structure/{id}")

		public void deletestructure(@PathVariable(value="id") Long id) {

		var val = structureRepository.findById(id);
		 if(!val.isPresent()) { 
			 System.out.println("invalid id");
		 }else {
			 structureRepository.deleteById(id);
		}
		}
}

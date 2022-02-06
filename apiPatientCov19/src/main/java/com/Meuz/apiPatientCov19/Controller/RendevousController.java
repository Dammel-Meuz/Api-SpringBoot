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

import com.Meuz.apiPatientCov19.Entity.RendezVous;
import com.Meuz.apiPatientCov19.Repository.RendezVousRepository;

@RestController
public class RendevousController {
	 @Autowired 
	 private RendezVousRepository rendevRendezVousRepository;
	 
	 
	 @GetMapping("/rendezvous")
		
		public List<RendezVous> listsRendervous() {
			return rendevRendezVousRepository.findAll();
			
		}
	@GetMapping("/rendezvous/{id}")
		
		public Optional<RendezVous> structureSanter(@PathVariable(value="id") Long id) {
		
		var val = rendevRendezVousRepository.findById(id);
		 if(!val.isPresent()) { 
			 return null;
		 }else {
			 return rendevRendezVousRepository.findById(id);
		}
			
			
		}

	@PostMapping("/rendezvous")
	public RendezVous addrendezvous(@RequestBody RendezVous rv ) {
		return rendevRendezVousRepository.save(rv);
		
	}
	@DeleteMapping("/rendezvous/{id}")

	public void deleterendezvous(@PathVariable(value="id") Long id) {

	var val = rendevRendezVousRepository.findById(id);
	 if(!val.isPresent()) { 
		 System.out.println("invalid id");
	 }else {
		 rendevRendezVousRepository.deleteById(id);
	}
		
		
	}

}

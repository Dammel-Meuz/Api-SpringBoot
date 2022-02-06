package com.Meuz.apiPatientCov19;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Meuz.apiPatientCov19.Entity.RendezVous;
import com.Meuz.apiPatientCov19.Repository.StructureSanterRepository;

import lombok.RequiredArgsConstructor;
import lombok.Setter;


@SpringBootApplication
public class ApiPatientCov19Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiPatientCov19Application.class, args);
		
		
	}
	private StructureSanterRepository structureSanterRepository ;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

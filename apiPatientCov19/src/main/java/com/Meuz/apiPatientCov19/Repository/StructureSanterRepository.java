package com.Meuz.apiPatientCov19.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Meuz.apiPatientCov19.Entity.Structure;
import com.Meuz.apiPatientCov19.Entity.StructureSante;

public interface StructureSanterRepository extends JpaRepository<StructureSante, Long>{

}

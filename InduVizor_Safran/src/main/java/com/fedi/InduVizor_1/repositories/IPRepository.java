package com.fedi.InduVizor_1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fedi.InduVizor_1.entities.IP;

public interface IPRepository extends JpaRepository<IP, Long> {
	
	 // Filter by Situation and HSE
	@Query("SELECT i FROM IP i WHERE (:situation IS NULL OR LOWER(i.Situation) LIKE LOWER(CONCAT('%', :situation, '%'))) AND (:hse IS NULL OR i.HSE = :hse)")
	List<IP> findBySituationAndHSE(@Param("situation") String situation, @Param("hse") Boolean hse);



}



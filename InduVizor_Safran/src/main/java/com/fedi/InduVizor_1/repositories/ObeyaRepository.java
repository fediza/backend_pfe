package com.fedi.InduVizor_1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fedi.InduVizor_1.entities.Obeya;

public interface ObeyaRepository extends JpaRepository<Obeya, Long> {
	
	// Filter by projet and status
    @Query("SELECT o FROM Obeya o WHERE (:projet IS NULL OR LOWER(o.projet) LIKE LOWER(CONCAT('%', :projet, '%'))) AND (:status IS NULL OR o.status = :status)")
    List<Obeya> findByProjetAndStatus(@Param("projet") String projet, @Param("status") String status);
}





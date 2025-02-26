package com.fedi.InduVizor_1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fedi.InduVizor_1.entities.Qualite;

public interface QualiteRepository extends JpaRepository<Qualite, Long> {
	
	 // Filter by Programme and Status
    @Query("SELECT q FROM Qualite q WHERE (:programme IS NULL OR LOWER(q.Programme) LIKE LOWER(CONCAT('%', :programme, '%'))) AND (:status IS NULL OR q.Status = :status)")
    List<Qualite> findByProgrammeAndStatus(@Param("programme") String programme, @Param("status") String status);
}


/*package com.fedi.InduVizor_1.repositories;

import com.fedi.InduVizor_1.entities.Qualite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QualiteRepository extends JpaRepository<Qualite, Long> {

    // Filter by Programme and Status
    @Query("SELECT q FROM Qualite q WHERE (:programme IS NULL OR LOWER(q.Programme) LIKE LOWER(CONCAT('%', :programme, '%')) AND (:status IS NULL OR q.Status = :status)")
    List<Qualite> findByProgrammeAndStatus(@Param("programme") String programme, @Param("status") String status);
}*/
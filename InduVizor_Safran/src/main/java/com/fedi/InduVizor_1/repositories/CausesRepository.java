package com.fedi.InduVizor_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fedi.InduVizor_1.entities.Causes;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface CausesRepository extends JpaRepository<Causes, Long> {

    @Query("SELECT c FROM Causes c WHERE c.status = :status")
    List<Causes> findByStatus(@Param("status") String status);


    // Filter by indicateur (case-insensitive search)
    @Query("SELECT c FROM Causes c WHERE (:indicateur IS NULL OR LOWER(c.indicateur) LIKE LOWER(CONCAT('%', :indicateur, '%')))")
    List<Causes> findByIndicateur(@Param("indicateur") String indicateur);
    
    @Query("SELECT c FROM Causes c WHERE (:date IS NULL OR c.date = :date) AND (:status IS NULL OR c.status = :status)")
    List<Causes> findByDateAndStatus(@Param("date") LocalDate date, @Param("status") String status);
    
} 

/*

import com.fedi.InduVizor_1.entities.Causes;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


    // Filter by date and status
    @Query("SELECT c FROM Causes c WHERE (:date IS NULL OR c.date = :date) AND (:status IS NULL OR c.status = :status)")
    List<Causes> findByDateAndStatus(@Param("date") Date date, @Param("status") String status);

    // Filter by indicateur (case-insensitive search)
    @Query("SELECT c FROM Causes c WHERE (:indicateur IS NULL OR LOWER(c.indicateur) LIKE LOWER(CONCAT('%', :indicateur, '%')))")
    List<Causes> findByIndicateur(@Param("indicateur") String indicateur);
}*/
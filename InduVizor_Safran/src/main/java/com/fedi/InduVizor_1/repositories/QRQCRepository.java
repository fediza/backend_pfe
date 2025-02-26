package com.fedi.InduVizor_1.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fedi.InduVizor_1.entities.QRQC;

public interface QRQCRepository extends JpaRepository<QRQC, Integer> {
    // Custom query methods can be added here if needed
}
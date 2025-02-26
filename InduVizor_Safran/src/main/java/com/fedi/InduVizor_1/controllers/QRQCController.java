package com.fedi.InduVizor_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.repositories.QRQCRepository;
import com.fedi.InduVizor_1.entities.QRQC;
import com.fedi.InduVizor_1.interfaces.QRQCApi;

import java.util.List;

@RestController
public class QRQCController implements QRQCApi {

    @Autowired
    private QRQCRepository qrqcRepository;

    @Override
    public List<QRQC> getAllQRQCs() {
        return qrqcRepository.findAll();
    }

    @Override
    public QRQC getQRQCBySemaine(@PathVariable int semaine) {
        return qrqcRepository.findById(semaine).orElse(null);
    }

    @Override
    public QRQC createQRQC(@RequestBody QRQC qrqc) {
        return qrqcRepository.save(qrqc);
    }

    @Override
    public QRQC updateQRQC(@PathVariable int semaine, @RequestBody QRQC qrqc) {
        // Ensure the QRQC entity exists
        QRQC existingQRQC = qrqcRepository.findById(semaine)
                .orElseThrow(() -> new IllegalArgumentException("QRQC with semaine " + semaine + " not found"));

        // Update the fields of the existing QRQC entity with the new values
        existingQRQC.setDate(qrqc.getDate()); // This will automatically recalculate semaine
        existingQRQC.setObj_securete(qrqc.getObj_securete());
        existingQRQC.setResponsable_securite(qrqc.getResponsable_securite());
        existingQRQC.setBackup_securete(qrqc.getBackup_securete());
        existingQRQC.setObj_qualite(qrqc.getObj_qualite());
        existingQRQC.setResponsable_qualite(qrqc.getResponsable_qualite());
        existingQRQC.setBackup_qualite(qrqc.getBackup_qualite());
        existingQRQC.setObj_OTD(qrqc.getObj_OTD());
        existingQRQC.setResponsable_OTD(qrqc.getResponsable_OTD());
        existingQRQC.setBackup_OTD(qrqc.getBackup_OTD());
        existingQRQC.setObj_cout(qrqc.getObj_cout());
        existingQRQC.setResponsable_cout(qrqc.getResponsable_cout());
        existingQRQC.setBackup_cout(qrqc.getBackup_cout());
        existingQRQC.setObj_IP(qrqc.getObj_IP());
        existingQRQC.setResponsable_IP(qrqc.getResponsable_IP());
        existingQRQC.setBackup_IP(qrqc.getBackup_IP());

        // Save the updated entity
        return qrqcRepository.save(existingQRQC);
    }

    @Override
    public void deleteQRQC(@PathVariable int semaine) {
        qrqcRepository.deleteById(semaine);
    }
}
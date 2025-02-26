package com.fedi.InduVizor_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.repositories.QualiteRepository;
import com.fedi.InduVizor_1.entities.Qualite;
import com.fedi.InduVizor_1.interfaces.QualiteApi;

import java.util.List;

@RestController
public class QualiteController implements QualiteApi {

    @Autowired
    private QualiteRepository qualiteRepository;

    @Override
    public List<Qualite> getAllQualites() {
        return qualiteRepository.findAll();
    }

    @Override
    public Qualite getQualiteById(@PathVariable Long id) {
        return qualiteRepository.findById(id).orElse(null);
    }

    @Override
    public Qualite createQualite(@RequestBody Qualite qualite) {
        return qualiteRepository.save(qualite);
    }

    @Override
    public Qualite updateQualite(@PathVariable Long id, @RequestBody Qualite qualite) {
        qualite.setIdQualite(id);
        return qualiteRepository.save(qualite);
    }

    @Override
    public void deleteQualite(@PathVariable Long id) {
        qualiteRepository.deleteById(id);
    }

    // Filter by Programme and Status
    @GetMapping("/filter")
    public List<Qualite> filterQualites(
            @RequestParam(required = false) String programme,
            @RequestParam(required = false) String status) {
        return qualiteRepository.findByProgrammeAndStatus(programme, status);}


}





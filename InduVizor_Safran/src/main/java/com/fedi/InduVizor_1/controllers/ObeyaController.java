package com.fedi.InduVizor_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.repositories.ObeyaRepository;
import com.fedi.InduVizor_1.entities.Obeya;
import com.fedi.InduVizor_1.interfaces.ObeyaApi;

import java.util.List;

@RestController
public class ObeyaController implements ObeyaApi {

    @Autowired
    private ObeyaRepository obeyaRepository;

    @Override
    public List<Obeya> getAllObeyas() {
        return obeyaRepository.findAll();
    }

    @Override
    public Obeya getObeyaById(@PathVariable Long id) {
        return obeyaRepository.findById(id).orElse(null);
    }

    @Override
    public Obeya createObeya(@RequestBody Obeya obeya) {
        return obeyaRepository.save(obeya);
    }

    @Override
    public Obeya updateObeya(@PathVariable Long id, @RequestBody Obeya obeya) {
        obeya.setIdTache(id);
        return obeyaRepository.save(obeya);
    }

    @Override
    public void deleteObeya(@PathVariable Long id) {
        obeyaRepository.deleteById(id);
    }

    // Filter by projet and status
    @GetMapping("/filter")
    public List<Obeya> filterObeyas(
            @RequestParam(required = false) String projet,
            @RequestParam(required = false) String status) {
        return obeyaRepository.findByProjetAndStatus(projet, status);}


}





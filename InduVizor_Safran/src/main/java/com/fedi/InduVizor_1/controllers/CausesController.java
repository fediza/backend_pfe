package com.fedi.InduVizor_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.repositories.CausesRepository;
import com.fedi.InduVizor_1.entities.Causes;
import com.fedi.InduVizor_1.interfaces.CausesApi;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class CausesController implements CausesApi {

    @Autowired
    private CausesRepository causesRepository;

    @Override
    public List<Causes> getAllCauses() {
        return causesRepository.findAll();
    }

    @Override
    public Causes getCauseById(@PathVariable Long id) {
        return causesRepository.findById(id).orElse(null);
    }

    @Override
    public Causes createCause(@RequestBody Causes cause) {
        return causesRepository.save(cause);
    }

    @Override
    public Causes updateCause(@PathVariable Long id, @RequestBody Causes cause) {
        cause.setIdCause(id);
        return causesRepository.save(cause);
    }

    @Override
    public void deleteCause(@PathVariable Long id) {
        causesRepository.deleteById(id);
    }
    
    // Filter by date and status
    @GetMapping("/filter")
    public List<Causes> filterCauses(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam(required = false) String status) {
        return causesRepository.findByDateAndStatus(date, status);
    }

    @GetMapping("/filter/indicateur")
    public List<Causes> filterByIndicateur(
            @RequestParam(required = false) String indicateur) {
        return causesRepository.findByIndicateur(indicateur);
    }
}





/*package com.fedi.InduVizor_1.controllers;

import com.fedi.InduVizor_1.entities.Causes;
import com.fedi.InduVizor_1.repositories.CausesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/causes")
public class CausesController {

    @Autowired
    private CausesRepository causesRepository;

    // Filter by date and status
    @GetMapping("/filter")
    public List<Causes> filterCauses(
            @RequestParam(required = false) Date date,
            @RequestParam(required = false) String status) {
        return causesRepository.findByDateAndStatus(date, status);
    }

    // Filter by indicateur
    @GetMapping("/filter/indicateur")
    public List<Causes> filterByIndicateur(
            @RequestParam(required = false) String indicateur) {
        return causesRepository.findByIndicateur(indicateur);
    }
}*/
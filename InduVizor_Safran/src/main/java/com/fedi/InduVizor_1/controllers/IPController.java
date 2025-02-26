package com.fedi.InduVizor_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.repositories.IPRepository;
import com.fedi.InduVizor_1.entities.Causes;
import com.fedi.InduVizor_1.entities.IP;
import com.fedi.InduVizor_1.interfaces.IPApi;

import java.time.LocalDate;
import java.util.List;

@RestController
public class IPController implements IPApi {

    @Autowired
    private IPRepository ipRepository;

    @Override
    public List<IP> getAllIPs() {
        return ipRepository.findAll();
    }

    @Override
    public IP getIPById(@PathVariable Long id) {
        return ipRepository.findById(id).orElse(null);
    }

    @Override
    public IP createIP(@RequestBody IP ip) {
        return ipRepository.save(ip);
    }

    @Override
    public IP updateIP(@PathVariable Long id, @RequestBody IP ip) {
        ip.setIdIP(id);
        return ipRepository.save(ip);
    }

    @Override
    public void deleteIP(@PathVariable Long id) {
        ipRepository.deleteById(id);
    }

    // Filter by Situation and HSE
    @GetMapping("/filter")
    public List<IP> filterIPs(
            @RequestParam(required = false) String situation,
            @RequestParam(required = false) Boolean hse) {
        return ipRepository.findBySituationAndHSE(situation, hse);}
}





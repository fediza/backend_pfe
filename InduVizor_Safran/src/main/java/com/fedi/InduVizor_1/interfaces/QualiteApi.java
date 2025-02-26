package com.fedi.InduVizor_1.interfaces;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.entities.Qualite;

@RequestMapping("/api/qualite")
public interface QualiteApi {

    @GetMapping
    List<Qualite> getAllQualites();

    @GetMapping("/{id}")
    Qualite getQualiteById(@PathVariable Long id);

    @PostMapping
    Qualite createQualite(@RequestBody Qualite qualite);

    @PutMapping("/{id}")
    Qualite updateQualite(@PathVariable Long id, @RequestBody Qualite qualite);

    @DeleteMapping("/{id}")
    void deleteQualite(@PathVariable Long id);
}
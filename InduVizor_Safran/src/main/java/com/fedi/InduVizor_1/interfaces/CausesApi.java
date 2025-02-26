package com.fedi.InduVizor_1.interfaces;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.entities.Causes;

@RequestMapping("/api/causes")
public interface CausesApi {

    @GetMapping
    List<Causes> getAllCauses();

    @GetMapping("/{id}")
    Causes getCauseById(@PathVariable Long id);

    @PostMapping
    Causes createCause(@RequestBody Causes cause);

    @PutMapping("/{id}")
    Causes updateCause(@PathVariable Long id, @RequestBody Causes cause);

    @DeleteMapping("/{id}")
    void deleteCause(@PathVariable Long id);
}
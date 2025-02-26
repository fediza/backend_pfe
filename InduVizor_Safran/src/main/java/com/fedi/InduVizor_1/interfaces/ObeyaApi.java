package com.fedi.InduVizor_1.interfaces;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.entities.Obeya;

@RequestMapping("/api/obeya")
public interface ObeyaApi {

    @GetMapping
    List<Obeya> getAllObeyas();

    @GetMapping("/{id}")
    Obeya getObeyaById(@PathVariable Long id);

    @PostMapping
    Obeya createObeya(@RequestBody Obeya obeya);

    @PutMapping("/{id}")
    Obeya updateObeya(@PathVariable Long id, @RequestBody Obeya obeya);

    @DeleteMapping("/{id}")
    void deleteObeya(@PathVariable Long id);
}
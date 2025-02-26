package com.fedi.InduVizor_1.interfaces;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.entities.IP;

@RequestMapping("/api/ip")
public interface IPApi {

    @GetMapping
    List<IP> getAllIPs();

    @GetMapping("/{id}")
    IP getIPById(@PathVariable Long id);

    @PostMapping
    IP createIP(@RequestBody IP ip);

    @PutMapping("/{id}")
    IP updateIP(@PathVariable Long id, @RequestBody IP ip);

    @DeleteMapping("/{id}")
    void deleteIP(@PathVariable Long id);
}
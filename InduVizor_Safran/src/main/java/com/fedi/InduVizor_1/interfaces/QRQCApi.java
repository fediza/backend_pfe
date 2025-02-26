package com.fedi.InduVizor_1.interfaces;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.fedi.InduVizor_1.entities.QRQC;

@RequestMapping("/api/qrqc")
public interface QRQCApi {

    @GetMapping
    List<QRQC> getAllQRQCs();

    @GetMapping("/{semaine}")
    QRQC getQRQCBySemaine(@PathVariable int semaine);

    @PostMapping
    QRQC createQRQC(@RequestBody QRQC qrqc);

    @PutMapping("/{semaine}")
    QRQC updateQRQC(@PathVariable int semaine, @RequestBody QRQC qrqc);

    @DeleteMapping("/{semaine}")
    void deleteQRQC(@PathVariable int semaine);
}
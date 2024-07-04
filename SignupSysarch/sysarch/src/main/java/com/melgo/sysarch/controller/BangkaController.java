package com.melgo.sysarch.controller;

import com.melgo.sysarch.dto.BangkaRequest;
import com.melgo.sysarch.model.Bangka;
import com.melgo.sysarch.service.BangkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bangka")
public class BangkaController {

    @Autowired
    private BangkaService bangkaService;

    @PostMapping("/add")
    public ResponseEntity<Bangka> addBangka(@RequestBody BangkaRequest request) {
        Bangka bangka = bangkaService.addBangka(request);
        return ResponseEntity.ok(bangka);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bangka>> getAllBangkas() {
        List<Bangka> bangkas = bangkaService.getAllBangkas();
        return ResponseEntity.ok(bangkas);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Bangka> getBangkaByName(@PathVariable String name) {
        try {
            Bangka bangka = bangkaService.getBangkaByName(name);
            return ResponseEntity.ok(bangka);
        } catch (Exception e) {
            return ResponseEntity.status(404).body(null);
        }
    }
}

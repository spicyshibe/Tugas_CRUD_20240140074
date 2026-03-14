package com.deploy.PraktikumKTP.controller;

import com.deploy.PraktikumKTP.dto.KtpDTO;
import com.deploy.PraktikumKTP.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ktp")
@CrossOrigin("*")
public class KtpController {
    @Autowired private KtpService service;

    @GetMapping public List<KtpDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public ResponseEntity<KtpDTO> getById(@PathVariable Integer id) { return ResponseEntity.ok(service.getById(id)); }
    @PostMapping public ResponseEntity<?> create(@RequestBody KtpDTO dto) { return ResponseEntity.ok(service.save(dto)); }
    @PutMapping("/{id}") public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody KtpDTO dto) { return ResponseEntity.ok(service.update(id, dto)); }
    @DeleteMapping("/{id}") public ResponseEntity<?> delete(@PathVariable Integer id) { service.delete(id); return ResponseEntity.ok("Deleted"); }
}
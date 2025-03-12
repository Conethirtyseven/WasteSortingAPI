package com.enviro.assessment.grad001.siphosethumofokeng.controller;

import com.enviro.assessment.grad001.siphosethumofokeng.entity.RecyclingTip;
import com.enviro.assessment.grad001.siphosethumofokeng.service.RecyclingTipService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recycling-tips")
public class RecyclingTipController {
    @Autowired
    private RecyclingTipService recyclingTipService;

    @GetMapping
    public List<RecyclingTip> getAllRecyclingTips() {
        return recyclingTipService.getAllRecyclingTips();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTip> getRecyclingTipById(@PathVariable Long id) {
        return recyclingTipService.getRecyclingTipById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RecyclingTip createRecyclingTip(@Valid  @RequestBody RecyclingTip recyclingTip) {
        return recyclingTipService.saveRecyclingTip(recyclingTip);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecyclingTip> updateRecyclingTip(@PathVariable Long id,@Valid @RequestBody RecyclingTip recyclingTip) {
        return recyclingTipService.getRecyclingTipById(id)
                .map(existingRecyclingTip -> {
                    recyclingTip.setId(id);
                    return ResponseEntity.ok(recyclingTipService.saveRecyclingTip(recyclingTip));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecyclingTip(@PathVariable Long id) {
        recyclingTipService.deleteRecyclingTip(id);
        return ResponseEntity.noContent().build();
    }
}

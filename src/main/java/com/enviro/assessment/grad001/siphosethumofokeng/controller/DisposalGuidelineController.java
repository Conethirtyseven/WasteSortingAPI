package com.enviro.assessment.grad001.siphosethumofokeng.controller;
import com.enviro.assessment.grad001.siphosethumofokeng.entity.DisposalGuideline;
import com.enviro.assessment.grad001.siphosethumofokeng.service.DisposalGuidelineService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disposal-guidelines")

public class DisposalGuidelineController {
    @Autowired
    private DisposalGuidelineService disposalGuidelineService;

    @GetMapping
    public List<DisposalGuideline> getAllDisposalGuidelines() {
        return getAllDisposalGuidelines();
    }
    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuideline> getDisposalGuidelineById(@PathVariable Long id) {
        return disposalGuidelineService.getDisposalGuidelineById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DisposalGuideline createDisposalGuideline(@Valid  @RequestBody DisposalGuideline disposalGuideline) {
        return disposalGuidelineService.saveDisposalGuideline(disposalGuideline);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuideline> updateDisposalGuideline(@PathVariable Long id,@Valid @RequestBody DisposalGuideline disposalGuideline) {
        return disposalGuidelineService.getDisposalGuidelineById(id)
                .map(existingDisposalGuideline -> {
                    disposalGuideline.setId(id);
                    return ResponseEntity.ok(disposalGuidelineService.saveDisposalGuideline(disposalGuideline));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisposalGuideline(@PathVariable Long id) {
        disposalGuidelineService.deleteDisposalGuideline(id);
        return ResponseEntity.noContent().build();
    }
}

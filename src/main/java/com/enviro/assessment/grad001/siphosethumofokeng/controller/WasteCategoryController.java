package com.enviro.assessment.grad001.siphosethumofokeng.controller;
import com.enviro.assessment.grad001.siphosethumofokeng.entity.WasteCategory;
import com.enviro.assessment.grad001.siphosethumofokeng.service.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {

    @Autowired
    private WasteCategoryService wasteCategoryService;

    @GetMapping
    public List<WasteCategory> getAllWasteCategories(){
        return wasteCategoryService.getAllWasteCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getWasteCategoryById(@PathVariable Long id){
        return wasteCategoryService.getWasteCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WasteCategory createWasteCategory(@Valid @RequestBody WasteCategory wasteCategory){
        return wasteCategoryService.saveWasteCategory(wasteCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WasteCategory> updateWasteCategory(@PathVariable Long id,@Valid @RequestBody WasteCategory wasteCategory){
        return wasteCategoryService.getWasteCategoryById(id)
                .map(existingWasteCategory -> {
                    wasteCategory.setId();
                    return ResponseEntity.ok(wasteCategoryService.saveWasteCategory(wasteCategory));
                })
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWasteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteWasteCategory(id);
        return ResponseEntity.noContent().build();
    }

}

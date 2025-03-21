package com.enviro.assessment.grad001.siphosethumofokeng.service;
import com.enviro.assessment.grad001.siphosethumofokeng.entity.WasteCategory;
import com.enviro.assessment.grad001.siphosethumofokeng.repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryService {
    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    public List<WasteCategory> getAllWasteCategories(){
        return wasteCategoryRepository.findAll();
    }

    public Optional<WasteCategory> getWasteCategoryById(Long id){
        return wasteCategoryRepository.findById(id);
    }
    public WasteCategory saveWasteCategory(WasteCategory wasteCategory){
        return wasteCategoryRepository.save(wasteCategory);
    }
    public void deleteWasteCategory(Long id){
        wasteCategoryRepository.deleteById(id);
    }
}

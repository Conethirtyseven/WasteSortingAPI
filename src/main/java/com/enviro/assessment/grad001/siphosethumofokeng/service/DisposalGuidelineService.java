package com.enviro.assessment.grad001.siphosethumofokeng.service;
import com.enviro.assessment.grad001.siphosethumofokeng.entity.DisposalGuideline;
import com.enviro.assessment.grad001.siphosethumofokeng.repository.DisposalGuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisposalGuidelineService {
    @Autowired
    private DisposalGuidelineRepository disposalGuidelineRepository;

    public List<DisposalGuideline> getDisposalGuideline(){
        return disposalGuidelineRepository.findAll();
    }

    public Optional<DisposalGuideline> getDisposalGuidelineById(Long id){
        return disposalGuidelineRepository.findById(id);
    }

    public DisposalGuideline saveDisposalGuideline(DisposalGuideline disposalGuideline) {
        return disposalGuidelineRepository.save(disposalGuideline);
    }

    public void deleteDisposalGuideline(Long id) {
        disposalGuidelineRepository.deleteById(id);
    }
}

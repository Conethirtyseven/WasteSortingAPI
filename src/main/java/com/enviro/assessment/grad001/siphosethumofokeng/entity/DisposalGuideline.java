package com.enviro.assessment.grad001.siphosethumofokeng.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class DisposalGuideline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Guideline is mandatory")
    private String guideline;
    private Long wasteCategoryId;

    //Getters and Setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getGuideline(){
        return guideline;
    }

    public void setGuideline(String guideline){
        this.guideline = guideline;
    }

    public Long getWasteCategoryId(){
        return wasteCategoryId;
    }

    public void setWasteCategoryId(Long wasteCategoryId){
        this.wasteCategoryId = wasteCategoryId;
    }

}

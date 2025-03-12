package com.enviro.assessment.grad001.siphosethumofokeng.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
@Entity
public class WasteCategory {
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Description is mandatory")
    private String description;

    //Getter and Setters
    public Long getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description =description;
    }


}

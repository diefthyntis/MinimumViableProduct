package com.diefthyntis.MinimumViableProduct.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "internaut",
uniqueConstraints = {
       @UniqueConstraint(columnNames = "emailAddress")
})
@Data
/* @Data annotation de LOMBOK 
 * qui permet de ne pas déclarer les getters et setters qui sont générés à la compilation
 * 
 */
public class Speaker {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String emailAddress;
    
    @NotBlank
    @Size(max = 20)
    private String name;
    
    @NotBlank
    @Size(max = 120)
    private String password;
    
    @Column(name = "createdAt")
    private java.time.LocalDateTime createdAt;
    
    @Column(name = "updatedAt")
    private java.time.LocalDateTime updatedAt;
    
    public Speaker(){
    	updatedAt=LocalDateTime.now();
    	createdAt = LocalDateTime.now();
    }
    
}

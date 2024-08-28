package com.diefthyntis.MinimumViableProduct.model;

import java.time.LocalDateTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "article")
@Data
public class Article {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@NotBlank
    @Size(max = 120)
    private String word;
	
	
	
	
	@ManyToOne
    @JoinColumn(name = "speakerId", referencedColumnName = "id")
    private Speaker speaker;
	
	@ManyToOne
    @JoinColumn(name = "topicId", referencedColumnName = "id")
    private Topic topic;
	
	
	 @Column(name = "createdAt")
	    private java.time.LocalDateTime createdAt;
	    
	    @Column(name = "updatedAt")
	    private java.time.LocalDateTime updatedAt;
	    
	    public Article(){
	    	updatedAt=LocalDateTime.now();
	    	createdAt = LocalDateTime.now();
	    }
}

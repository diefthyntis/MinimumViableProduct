package com.diefthyntis.MinimumViableProduct.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diefthyntis.MinimumViableProduct.model.Article;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

	List<Article> findBySpeakerid(Integer speakerId);
	
	 
}

package com.diefthyntis.MinimumViableProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diefthyntis.MinimumViableProduct.model.Article;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
}

package com.diefthyntis.MinimumViableProduct.service;

import org.springframework.stereotype.Service;

import com.diefthyntis.MinimumViableProduct.model.Article;
import com.diefthyntis.MinimumViableProduct.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;

/*
 * RequiredArgsConstructor à ajouter pour avoir une injection de dépendance par constructeur
 */

@Service
@RequiredArgsConstructor
public class ArticleService {

private final ArticleRepository articleRepository;
	
	public void save(Article article) {
		articleRepository.save(article);
	}

}

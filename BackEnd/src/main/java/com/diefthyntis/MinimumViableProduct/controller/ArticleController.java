package com.diefthyntis.MinimumViableProduct.controller;




import java.io.IOException;
import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.diefthyntis.MinimumViableProduct.dto.request.ArticleRequest;
import com.diefthyntis.MinimumViableProduct.dto.response.ServerResponse;
import com.diefthyntis.MinimumViableProduct.mapping.ArticleMapping;
import com.diefthyntis.MinimumViableProduct.model.Article;
import com.diefthyntis.MinimumViableProduct.service.ArticleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * @RequiredArgsConstructor permet d'avoir un constructeur avec la dépendance "final" injectée 
 * "dépendance" est en fait une déclaration de classe de type service "service, repository ou mapping
 * @RequiredArgsConstructor permet de ne pas avoir à créer le constructeur chargé d'instancier articleService et articleMapping
 */

/*
 * @Slf4j permet d'injecter un loggueur
 */

/*
 * Il y autant de thread que d'utilisateurs connecté
 * L'information de l'utilisateur connecté est disponible dans l'interface Principal
 */



@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class ArticleController {
	private final ArticleService articleService;
	private final ArticleMapping articleMapping;
	
	@PostMapping("/messages")
    public ResponseEntity<ServerResponse> create(final @RequestBody ArticleRequest articleRequest) throws IOException, java.io.IOException {
		log.info("debut de la creation de article");
			
		/*
		 * l'objet ArticleRequest est posté par le FrontEnd et reçu par le controller
		 */
		
		final Article article = articleMapping.mapArticleRequestToArticle(articleRequest);
		articleService.save(article);
			
		
		return ResponseEntity.ok(new ServerResponse("Message send with success"));
      
    }
	
	
}

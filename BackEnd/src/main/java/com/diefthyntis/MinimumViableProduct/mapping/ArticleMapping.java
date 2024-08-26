package com.diefthyntis.MinimumViableProduct.mapping;

import org.springframework.stereotype.Component;
import org.springframework.util.NumberUtils;

import com.diefthyntis.MinimumViableProduct.dto.request.ArticleRequest;
import com.diefthyntis.MinimumViableProduct.model.Article;
import com.diefthyntis.MinimumViableProduct.model.Internaut;
import com.diefthyntis.MinimumViableProduct.model.Topic;
import com.diefthyntis.MinimumViableProduct.service.InternautService;
import com.diefthyntis.MinimumViableProduct.service.TopicService;

import lombok.RequiredArgsConstructor;

/*
* TopicMapping propose des méthodes qui permettent de mapper un objet TopicRequest vers Topic
* L'objet TopicRequest est posté par le FrontEnd et reçu par le controller
*/

/*
* Grace à l'annotation @RequiredArgsConstructor, il n'y pas besoin d'instancier internautService
*/

/*
 * l'objet ArticleRequest est posté par le FrontEnd et reçu par le controller
 */
@Component
@RequiredArgsConstructor
public class ArticleMapping {
	private final InternautService internautService;
	private final TopicService topicService;
	public Article mapArticleRequestToArticle(ArticleRequest articleRequest)
	{
		final Article article = new Article();
		article.setWord(articleRequest.getSentence());
		Internaut internaut = internautService.getInternautById(NumberUtils.convertToInteger(articleRequest.getInternautId()));
		article.setInternaut(internaut);
		Topic topic=topicService.getTopicById(NumberUtils.convertToInteger(articleRequest.getTopicId()));
		article.setTopic(topic);
		
		return article;
	}

}

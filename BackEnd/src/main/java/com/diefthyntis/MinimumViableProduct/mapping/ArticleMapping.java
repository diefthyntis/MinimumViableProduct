package com.diefthyntis.MinimumViableProduct.mapping;

import org.springframework.stereotype.Component;


import com.diefthyntis.MinimumViableProduct.dto.request.ArticleRequest;
import com.diefthyntis.MinimumViableProduct.model.Article;
import com.diefthyntis.MinimumViableProduct.model.Speaker;
import com.diefthyntis.MinimumViableProduct.model.Topic;
import com.diefthyntis.MinimumViableProduct.service.SpeakerService;
import com.diefthyntis.MinimumViableProduct.service.TopicService;
import com.diefthyntis.MinimumViableProduct.util.NumberUtils;

import lombok.RequiredArgsConstructor;

/*
* TopicMapping propose des méthodes qui permettent de mapper un objet TopicRequest vers Topic
* L'objet TopicRequest est posté par le FrontEnd et reçu par le controller
*/

/*
* Grace à l'annotation @RequiredArgsConstructor, il n'y pas besoin d'instancier speakerService
*/

/*
 * l'objet ArticleRequest est posté par le FrontEnd et reçu par le controller
 */
@Component
@RequiredArgsConstructor
public class ArticleMapping {
	private final SpeakerService speakerService;
	private final TopicService topicService;
	public Article mapArticleRequestToArticle(ArticleRequest articleRequest)
	{
		final Article article = new Article();
		article.setWord(articleRequest.getSentence());
		Speaker speaker = speakerService.getSpeakerById(NumberUtils.convertToInteger(articleRequest.getSpeakerId()));
		article.setSpeaker(speaker);
		Topic topic=topicService.getTopicById(NumberUtils.convertToInteger(articleRequest.getTopicId()));
		article.setTopic(topic);
		
		return article;
	}

}

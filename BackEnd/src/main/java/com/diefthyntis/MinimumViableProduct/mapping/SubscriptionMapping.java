package com.diefthyntis.MinimumViableProduct.mapping;

import org.springframework.stereotype.Component;


import com.diefthyntis.MinimumViableProduct.dto.request.SubscriptionRequest;
import com.diefthyntis.MinimumViableProduct.model.Subscription;
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
 * l'objet SubscriptionRequest est posté par le FrontEnd et reçu par le controller
 */
@Component
@RequiredArgsConstructor
public class SubscriptionMapping {
	private final SpeakerService speakerService;
	private final TopicService topicService;
	public Subscription mapSubscriptionRequestToSubscription(SubscriptionRequest subscriptionRequest)
	{
		final Subscription subscription = new Subscription();
		Speaker speaker = speakerService.getSpeakerById(NumberUtils.convertToInteger(subscriptionRequest.getSpeakerId()));
		subscription.setSpeaker(speaker);
		Topic topic=topicService.getTopicById(NumberUtils.convertToInteger(subscriptionRequest.getTopicId()));
		subscription.setTopic(topic);
		
		return subscription;
	}

}

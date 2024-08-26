package com.diefthyntis.MinimumViableProduct.service;

import org.springframework.stereotype.Service;

import com.diefthyntis.MinimumViableProduct.model.Subscription;
import com.diefthyntis.MinimumViableProduct.repository.SubscriptionRepository;

import lombok.RequiredArgsConstructor;

/*
 * RequiredArgsConstructor à ajouter pour avoir une injection de dépendance par constructeur
 */

@Service
@RequiredArgsConstructor
public class SubscriptionService {

private final SubscriptionRepository subscriptionRepository;
	
	public void save(Subscription subscription) {
		subscriptionRepository.save(subscription);
	}

}

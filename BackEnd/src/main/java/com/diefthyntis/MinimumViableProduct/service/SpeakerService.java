package com.diefthyntis.MinimumViableProduct.service;

import org.springframework.stereotype.Service;

import com.diefthyntis.MinimumViableProduct.exception.SpeakerNotFoundException;
import com.diefthyntis.MinimumViableProduct.model.Speaker;
import com.diefthyntis.MinimumViableProduct.repository.SpeakerRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpeakerService {
	private final SpeakerRepository speakerRepository;
	
	
	public Boolean existsByEmailAddress(final String emailAddress){
		return speakerRepository.existsByEmailAddress(emailAddress);
		
	}
	
	public Speaker getSpeakerById(Integer id) {
		return speakerRepository.findById(id).orElseThrow(() -> new SpeakerNotFoundException("Speaker Not Found"));
	}

	public Speaker findByEmail(String emailAddress) {
		return speakerRepository.findByEmailAddress(emailAddress).orElseThrow(() -> new SpeakerNotFoundException("Speaker Not Found"));
	}
	
	public Speaker save(Speaker speaker) {
		return speakerRepository.save(speaker);
	}

	
}

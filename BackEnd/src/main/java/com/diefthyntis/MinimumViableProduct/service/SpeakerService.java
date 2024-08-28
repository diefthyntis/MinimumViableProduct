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
	
	
	public Boolean existsBylogin(final String login){
		return speakerRepository.existsByLogin(login);
		
	}
	
	public Speaker getSpeakerById(Integer id) {
		return speakerRepository.findById(id).orElseThrow(() -> new SpeakerNotFoundException("Speaker Not Found"));
	}

	public Speaker findBylogin(String login) {
		return speakerRepository.findByLogin(login).orElseThrow(() -> new SpeakerNotFoundException("Speaker Not Found"));
	}
	
	public Speaker save(Speaker speaker) {
		return speakerRepository.save(speaker);
	}

	public Boolean existsByPseudonym(final String login){
		return speakerRepository.existsByPseudonym(login);
		
	}
	
}

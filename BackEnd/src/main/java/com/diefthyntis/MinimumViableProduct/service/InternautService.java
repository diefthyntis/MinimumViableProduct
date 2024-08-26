package com.diefthyntis.MinimumViableProduct.service;

import org.springframework.stereotype.Service;

import com.diefthyntis.MinimumViableProduct.exception.InternautNotFoundException;
import com.diefthyntis.MinimumViableProduct.model.Internaut;
import com.diefthyntis.MinimumViableProduct.repository.InternautRepository;



import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InternautService {
	private final InternautRepository internautRepository;
	
	
	public Boolean existsByEmailAddress(final String emailAddress){
		return internautRepository.existsByEmail(emailAddress);
		
	}
	
	public Internaut getInternautById(Integer id) {
		return internautRepository.findById(id).orElseThrow(() -> new InternautNotFoundException("Internaut Not Found"));
	}

	public Internaut findByEmail(String emailAddress) {
		return internautRepository.findByEmail(emailAddress).orElseThrow(() -> new InternautNotFoundException("Internaut Not Found"));
	}

	
}

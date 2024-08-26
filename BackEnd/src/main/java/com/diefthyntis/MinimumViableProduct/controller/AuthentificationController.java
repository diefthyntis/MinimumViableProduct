package com.diefthyntis.MinimumViableProduct.controller;


import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diefthyntis.MinimumViableProduct.dto.request.RegisterRequest;
import com.diefthyntis.MinimumViableProduct.dto.request.SigninRequest;
import com.diefthyntis.MinimumViableProduct.exception.EmailAddressAlreadyExistsException;
import com.diefthyntis.MinimumViableProduct.model.Speaker;
import com.diefthyntis.MinimumViableProduct.security.JwtToken;
import com.diefthyntis.MinimumViableProduct.service.SpeakerService;
import com.diefthyntis.MinimumViableProduct.util.JwtUtils;

import lombok.RequiredArgsConstructor;

// AuthController communique directement avec le FrontEnd, Angular ou Postman


@RestController
/*
 * @RequestMapping("/api/auth")
 */
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthentificationController {
	private final SpeakerService speakerService;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	private final JwtUtils jwtUtils;
	
	@PostMapping("/register")
    public ResponseEntity<?> registerUser(final @RequestBody RegisterRequest registerRequest) {
		// ? signifie la généricité, donc je peux passer n'importe quel type d'objet dans la méthode responseEntity.ok
		if (speakerService.existsByEmailAddress(registerRequest.getEmailAddress())) {
            throw new EmailAddressAlreadyExistsException("Email address already exists.");
        }
		
		final Speaker speaker = new Speaker();
		speaker.setEmailAddress(registerRequest.getEmailAddress());
		speaker.setName(registerRequest.getName());
		speaker.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
		speakerService.save(speaker);
		
		final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(registerRequest.getEmailAddress(), registerRequest.getPassword()));
        final String jwt = jwtUtils.generateJwtToken(authentication);
		
		
		JwtToken jwtToken= new JwtToken(jwt);
		return ResponseEntity.ok(jwtToken);
		
		
		/* dans cette application Chatop, il y a un parti pris de créer le compte utilisateur
		 * et de redigirer tout de suite sur la page du gestion du profil utilisateur
		 * mais cela pourrait etre fait en 2 temps où le user serait obligé de se connecter après validation
		 * de la création de son compte
		 */
		
	}
	
	
	@PostMapping("/login")
    public ResponseEntity<?> connexionUser(final @RequestBody SigninRequest signinRequest) {
		
	
		
		final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signinRequest.getEmail(), signinRequest.getPassword()));
        final String jwt = jwtUtils.generateJwtToken(authentication);
		
		
		JwtToken jwtToken= new JwtToken(jwt);
		return ResponseEntity.ok(jwtToken);
		
		
		/* dans cette application Chatop, il y a un parti pris de créer le compte utilisateur
		 * et de redigirer tout de suite sur la page du gestion du profil utilisateur
		 * mais cela pourrait etre fait en 2 temps où le user serait obligé de se connecter après validation
		 * de la création de son compte
		 */
		
	}


	@GetMapping("/me")
    public ResponseEntity<Speaker> getMe(final Principal principal) {
		String emailAddressUser = principal.getName();
		final Speaker speaker=speakerService.findByEmail(emailAddressUser);
		return ResponseEntity.ok(speaker);
    }
	
	
	
}


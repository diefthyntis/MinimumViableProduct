package com.diefthyntis.MinimumViableProduct.repository;

import org.springframework.stereotype.Repository;

import com.diefthyntis.MinimumViableProduct.model.Internaut;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;


@Repository
public interface InternautRepository extends JpaRepository<Internaut, Integer> {

	Optional<Internaut> findByEmail(String emailAddress);
	
	Boolean existsByEmail(String emailAddress);

}

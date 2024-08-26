package com.diefthyntis.MinimumViableProduct.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.diefthyntis.MinimumViableProduct.model.Topic;





@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {
	
	
	List<Topic> findByowner_id(Integer ownerId);
	

}

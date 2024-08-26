package com.diefthyntis.MinimumViableProduct.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.diefthyntis.MinimumViableProduct.exception.CommentNotFoundException;
import com.diefthyntis.MinimumViableProduct.model.Comment;
import com.diefthyntis.MinimumViableProduct.repository.CommentRepository;

import lombok.RequiredArgsConstructor;


/*
 * RequiredArgsConstructor à ajouter pour avoir une injection de dépendance par constructeur
 */

@Service
@RequiredArgsConstructor
public class CommentService {
	private final CommentRepository commentRepository;
	
	public Comment save(Comment comment) {
		return commentRepository.save(comment);
	}
	
	public Comment getCommentById(Integer commentId) {
		return commentRepository.findById(commentId).orElseThrow(() -> new CommentNotFoundException("Comment Not Found"));
	}
	

	 
	public List<Comment> getComments() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
		}
	 
	
	 public List<Comment> getCommentsByUserId(Integer userId) {
			// TODO Auto-generated method stub
			return commentRepository.findByInternautId(userId);
			}
	
	
	public void update(Comment comment) {
		commentRepository.save(comment);
	}
	
	
	
	
}


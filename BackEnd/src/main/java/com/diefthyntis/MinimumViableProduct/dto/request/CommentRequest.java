package com.diefthyntis.MinimumViableProduct.dto.request;

import lombok.Data;

@Data
public class CommentRequest {
	private String sentence;
	private String internautId;
	private String articleId;
}

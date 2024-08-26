package com.diefthyntis.MinimumViableProduct.dto.response;

import lombok.Data;

@Data
public class ArticleResponse {
	private Integer id;
	private String description;
    private Integer creatorId;
    private Integer topicId;
    private String created_at;
	private String updated_at;
    
}

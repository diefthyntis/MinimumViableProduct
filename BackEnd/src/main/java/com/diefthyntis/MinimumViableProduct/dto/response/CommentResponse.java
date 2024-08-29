package com.diefthyntis.MinimumViableProduct.dto.response;

import lombok.Data;

@Data
public class CommentResponse {
	private Integer id;
	private String description;
    private Integer creatorId;
    private Integer articleId;
    private String creationdate;
	private String modificationdate;
    
}

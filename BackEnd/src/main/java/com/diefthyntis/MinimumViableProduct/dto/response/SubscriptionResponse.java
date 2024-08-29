package com.diefthyntis.MinimumViableProduct.dto.response;

import lombok.Data;

@Data
public class SubscriptionResponse {
	private Integer id;
	private Integer creatorId;
    private Integer topicId;
    private String creationdate;
	private String modificationdate;
    
}

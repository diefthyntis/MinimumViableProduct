package com.diefthyntis.MinimumViableProduct.dto.request;

import lombok.Data;

@Data
public class RegisterRequest {
	private String emailAddress;
	private String password;
	private String name;
}

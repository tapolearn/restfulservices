package com.taposoft.learning.springboot.restfulservices.exception;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@AllArgsConstructor
public @Data class ErrorResponse {
	private LocalDateTime timestamp;
	private String message;
	private String[] errors;
}

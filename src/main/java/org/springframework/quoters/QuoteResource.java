package org.springframework.quoters;

import lombok.Data;

@Data
class QuoteResource {

	private String type;
	private Quote value;

	QuoteResource(Quote value, String type) {

		this.value = value;
		this.type = type;
	}
}
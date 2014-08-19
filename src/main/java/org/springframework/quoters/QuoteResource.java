package org.springframework.quoters;

public class QuoteResource {

	private final String type;
	private final Quote value;

	public QuoteResource(Quote quote, String type) {
		this.value = quote;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public Quote getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Type: " + type + " Value: " + value;
	}

}
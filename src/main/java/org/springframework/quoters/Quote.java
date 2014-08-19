package org.springframework.quoters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Quote {

	@Id @GeneratedValue
	Long id;

	private String quote;

	protected Quote() {
	}

	public Quote(String quote) {
		this.quote = quote;
	}

	public Long getId() {
		return id;
	}

	public String getQuote() {
		return quote;
	}

	@Override
	public String toString() {
		return "id: " + id + " Quote: " + quote;
	}

}
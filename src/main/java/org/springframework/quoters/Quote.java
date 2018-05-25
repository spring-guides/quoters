package org.springframework.quoters;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Quote {

	@Id @GeneratedValue
	private Long id;
	
	private String quote;

	Quote(String quote) {
		this.quote = quote;
	}
}
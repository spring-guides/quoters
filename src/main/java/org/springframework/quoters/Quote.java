/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.quoters;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Quote {

	@Id @GeneratedValue private Long id;
	private String quote;

	Quote(String quote) {
		this.quote = quote;
	}

	protected Quote() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Quote))
			return false;
		Quote quote1 = (Quote) o;
		return Objects.equals(id, quote1.id) && Objects.equals(quote, quote1.quote);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, quote);
	}

	@Override
	public String toString() {
		return "Quote{" + "id=" + id + ", quote='" + quote + '\'' + '}';
	}
}

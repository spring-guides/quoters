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

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	private final static Quote NONE = new Quote("None");
	private final static Random RANDOMIZER = new Random();

	private final QuoteRepository repository;

	public QuoteController(QuoteRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/api")
	public List<QuoteResource> getAll() {

		return repository.findAll().stream()
			.map(quote -> new QuoteResource(quote, "success"))
			.collect(Collectors.toList());
	}

	@GetMapping("/api/{id}")
	public QuoteResource getOne(@PathVariable Long id) {

		return repository.findById(id)
			.map(quote -> new QuoteResource(quote, "success"))
			.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	@GetMapping("/api/random")
	public QuoteResource getRandomOne() {
		return getOne(nextLong(1, repository.count() + 1));
	}

	private long nextLong(long lowerRange, long upperRange) {
		return (long) (RANDOMIZER.nextDouble() * (upperRange - lowerRange)) + lowerRange;
	}
}

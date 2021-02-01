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

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseLoader {

	@Bean
	CommandLineRunner init(QuoteRepository repository) {

		return args -> {
			repository.save(new Quote("Working with Spring Boot is like pair-programming with the Spring developers."));
			repository.save(new Quote("With Boot you deploy everywhere you can find a JVM basically."));
			repository.save(new Quote("Spring has come quite a ways in addressing developer enjoyment and "
					+ "ease of use since the last time I built an application using it."));
			repository.save(new Quote(
					"Previous to Spring Boot, I remember XML hell, confusing set up, and " + "many hours of frustration."));
			repository.save(new Quote("Spring Boot solves this problem. It gets rid of XML and wires up "
					+ "common components for me, so I don't have to spend hours scratching my "
					+ "head just to figure out how it's all pieced together."));
			repository.save(new Quote("It embraces " + "convention over configuration, providing an experience on par with "
					+ "frameworks that excel at early stage development, such as Ruby on " + "Rails."));
			repository.save(new Quote("The real benefit of Boot, however, is that it's just Spring. That "
					+ "means any direction the code takes, regardless of complexity, I know " + "it's a safe bet."));
			repository.save(new Quote("I don't worry about my code scaling. Boot allows the "
					+ "developer to peel back the layers and customize when it's appropriate "
					+ "while keeping the conventions that just work."));
			repository.save(new Quote("So easy it is to switch container in #springboot."));
			repository.save(new Quote("Really loving Spring Boot, makes stand alone Spring apps easy."));
			repository.save(new Quote("I have two hours today to build an app from scratch. @springboot to the rescue!"));
			repository.save(new Quote("@springboot with @springframework is pure productivity! Who said in #java one has "
					+ "to write double the code than in other langs? #newFavLib"));
		};
	}
}

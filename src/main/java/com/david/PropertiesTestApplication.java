package com.david;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class PropertiesTestApplication {

	@Value("${names}")
	private String names;

	@Bean(name = "dogs")
	public Map<String, List<String>> init() {
		Map<String, List<String>> dogs = new HashMap<>();

		for (String nameMapElement : names.split(";")) {
			String name = nameMapElement.split(":")[0];

			List<String> breeds = Arrays.asList(nameMapElement.split(":")[1].split(","));

			dogs.put(name, breeds);
		}

		return dogs;
	}


	public static void main(String[] args) {
		SpringApplication.run(PropertiesTestApplication.class, args);
	}
}

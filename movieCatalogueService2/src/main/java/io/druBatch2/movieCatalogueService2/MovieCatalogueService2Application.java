package io.druBatch2.movieCatalogueService2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieCatalogueService2Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogueService2Application.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return  new RestTemplate();
	}

}

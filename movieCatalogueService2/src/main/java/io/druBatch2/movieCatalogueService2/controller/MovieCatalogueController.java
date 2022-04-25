package io.druBatch2.movieCatalogueService2.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.startup.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.druBatch2.movieCatalogueService2.Entity.CatalogItem;
import io.druBatch2.movieCatalogueService2.Entity.Movie;
import io.druBatch2.movieCatalogueService2.Entity.Rating;



@RestController
public class MovieCatalogueController {

	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){

		RestTemplate restTemplate = new RestTemplate();

		List<Rating>ratingList =  Arrays.asList(new Rating("123",4),
				new Rating("567",3));
		//      ratingList.stream().map(rating ->
		//	new CatalogItem("avengers",
		//			"saving the world", 4)
		//).Collect(Collectors.toList());
		//      

		return ratingList.stream()
				.map(rating -> {
					Movie movie = restTemplate.getForObject("http://localhost:8002/movies/4", Movie.class);
					return new CatalogItem(movie.getName(),"aliens description",rating.getRating());
				})
				.collect(Collectors.toList());


	}


}

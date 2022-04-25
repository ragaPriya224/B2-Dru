package io.druBatch2.movieCatalogueService2.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.catalina.startup.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.druBatch2.movieCatalogueService2.Entity.CatalogItem;
import io.druBatch2.movieCatalogueService2.Entity.Rating;



@RestController
public class MovieCatalogueController {
	

	
	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		
		List<Rating>ratingList =  Arrays.asList(new Rating("123",4),
				new Rating("567",3));
		
		return Collections.singletonList(new CatalogItem("avengers",
				"saving the world", 4));
	}
	

}

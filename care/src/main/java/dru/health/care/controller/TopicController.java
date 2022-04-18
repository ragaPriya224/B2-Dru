package dru.health.care.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dru.health.care.Topic;
import dru.health.care.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topic")
	public  List<Topic>  getTopic() {
		return topicService.getTopic();
		
	}
	@RequestMapping("/topic/{id}")
	public  Topic getTopicById(@PathVariable String id) {
		return topicService.getTopicById(id);
		
	}

}

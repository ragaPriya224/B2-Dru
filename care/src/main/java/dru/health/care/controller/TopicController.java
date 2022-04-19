package dru.health.care.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dru.health.care.entity.Topic;
import dru.health.care.service.TopicService;

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
	@RequestMapping(method = RequestMethod.PUT,value = "/topic/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
		 topicService.updateTopicById(id,topic);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	@RequestMapping(method = RequestMethod.POST , value = "/topic")
	public void createTopic( @RequestBody Topic topic) {
		topicService.createTopic(topic);
	}
}

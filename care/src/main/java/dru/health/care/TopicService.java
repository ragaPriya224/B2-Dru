package dru.health.care;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	 List<Topic>topicList=Arrays.asList(new Topic("5", "adventure", "all about exploring aliens")
			,new Topic("7", "magic", "all about exploring magical world")
			);
	
	public List<Topic> getTopic(){
		return Arrays.asList(new Topic("5", "adventure", "all about exploring aliens")
				,new Topic("7", "magic", "all about exploring magical world")
				);
	}
	
	public Topic getTopicById(String id) {
		return topicList.stream().filter(i -> i.getId().equals(id)).findFirst().get();
		
	}
}

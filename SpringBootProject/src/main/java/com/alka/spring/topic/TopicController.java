package com.alka.spring.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	public TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	@ResponseStatus(HttpStatus.CREATED)
	public void createTopics(@RequestBody Topic topic){
		 topicService.createTopic(topic);
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopicsById(@PathVariable String id){
		return topicService.getTopicsById(id);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/topic{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateTopic(@PathVariable String id , @RequestBody Topic topic) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topic{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}

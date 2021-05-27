package io.alka.springBoot.Topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;


	@RequestMapping("/topics")
	public List<TopicEntity> getAllTopics(){
		
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public TopicEntity getTopic(@PathVariable Integer id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	@ResponseStatus(HttpStatus.CREATED)
	public void createTopic(@RequestBody TopicEntity topic) {
		topicService.createTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateTopic(@RequestBody TopicEntity topic,@PathVariable Integer id) {
		topicService.updateTopic(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);
	}
	
	
	
	//Filter concept
	@RequestMapping("/filteredTopics")
	public List<TopicEntity> getTopics(@RequestParam("yearAdded") Integer year,@RequestParam("name") String name){
		return topicService.getTopics(year,name);
	}
	
	
}

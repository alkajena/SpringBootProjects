package com.alka.spring.topic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired(required=true)
	TopicRepository topicRepo;

	public List<Topic> getTopics() {
		List<Topic> topics=new ArrayList<>();
		for(Topic itr:topicRepo.findAll()) {
			topics.add(itr);
		}
		return topics;
	}

	public Optional<Topic> getTopicsById(String id) {
		return topicRepo.findById(id);
	}

	public void createTopic(Topic topic) {
		
		topicRepo.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepo.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepo.deleteById(id);
		
	}

}

package io.alka.springBoot.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	public static TopicEntity[] topicArr=new TopicEntity[] {new TopicEntity(1, "Java", "java desc", 2005),new TopicEntity(2, "Spring","Spring desc",2008)};
	List<TopicEntity> list=new ArrayList<>(Arrays.asList(topicArr));
	//List<TopicEntity> list=new ArrayList<>();
	
	public List<TopicEntity> getAllTopics(){
		return list;
	}

	public TopicEntity getTopic(Integer id) {
		
		for(TopicEntity topic:list) {
			if(topic.getId().equals(id)) {
				return topic;
			}
		}
		return null;
	}

	public void createTopic(TopicEntity topic) {
		list.add(topic);
		
	}

	public void updateTopic(TopicEntity topic, Integer id) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId().equals(id)) {
				list.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(Integer id) {
		for(TopicEntity topic:list) {
			if(topic.getId().equals(id)) {
				list.remove(topic);
				return;
			}
		}
		
	}

	public List<TopicEntity> getTopics(Integer year,String name) {
		List<TopicEntity> filteredList=new ArrayList<>();
		for(TopicEntity topic:list) {
			if(topic.getYearAdded().equals(year) && topic.getName().equalsIgnoreCase(name)) {
				filteredList.add(topic);
			}
		}
		return filteredList;
	}
	

}

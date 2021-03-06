package com.alka.spring.topic;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.alka.spring.course.Course;

@Entity
public class Topic {

	@Id
	private String topicId;
	private String name;
	
	/*@OneToMany(mappedBy = "topic")
	private List<Course> course;
	
	
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}*/
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

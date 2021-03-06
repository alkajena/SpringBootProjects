package com.alka.spring.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import com.alka.spring.topic.Topic;

@Entity
public class Course {

	@Id
	private String courseId;
	private String name;
	
	@ManyToOne
	//@JoinColumn(name="topicId")
	private Topic topic;
	
	
	public String getcourseId() {
		return courseId;
	}
	public void setcourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}

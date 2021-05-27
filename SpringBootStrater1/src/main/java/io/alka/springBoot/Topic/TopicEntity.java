package io.alka.springBoot.Topic;


public class TopicEntity {
	
	private Integer id;
	private String name;
	private String description;
	private Integer yearAdded;
	
	
	TopicEntity(Integer id,String name,String description,Integer yearAdded){
		this.id=id;
		this.name=name;
		this.description=description;
		this.yearAdded=yearAdded;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getYearAdded() {
		return yearAdded;
	}
	public void setYearAdded(Integer yearAdded) {
		this.yearAdded = yearAdded;
	}
}

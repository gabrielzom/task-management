package com.example.demoapi.dto;

public class CreateTaskDto {
	
	private String title;
	private String description;
	private String username; 
	
	public void GetTaskStatus() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}

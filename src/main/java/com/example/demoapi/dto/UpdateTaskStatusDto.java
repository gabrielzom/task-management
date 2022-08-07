package com.example.demoapi.dto;

import com.example.demoapi.utils.TaskStatus;

public class UpdateTaskStatusDto {
	private TaskStatus status;
	private String username;
	public TaskStatus getStatus() {
		return status;
	}
	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	} 
}

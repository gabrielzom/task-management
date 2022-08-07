package com.example.demoapi.dto;
import com.example.demoapi.utils.TaskStatus;

public class CreateTaskResponseDto {
	private String id;
	private TaskStatus status;
	
	public void GetTaskStatus() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TaskStatus getStatus() {
		return status;
	}
	public void setStatus(TaskStatus status) {
		this.status = status;
	}
}

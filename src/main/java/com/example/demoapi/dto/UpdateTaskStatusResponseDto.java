package com.example.demoapi.dto;
import java.util.Date;

import com.example.demoapi.utils.TaskStatus;

public class UpdateTaskStatusResponseDto {
	private String id;
	private TaskStatus status;
	private Date timeOfUpdated;
	
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

	public Date getTimeOfUpdated() {
		return timeOfUpdated;
	}

	public void setTimeOfUpdated(Date timeOfUpdated) {
		this.timeOfUpdated = timeOfUpdated;
	}
}

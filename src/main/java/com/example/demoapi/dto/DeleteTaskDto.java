package com.example.demoapi.dto;

import java.util.Date;

public class DeleteTaskDto {
	private String id;
	private Date timeOfDelete;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getTimeOfDelete() {
		return timeOfDelete;
	}
	public void setTimeOfDelete(Date timeOfDelete) {
		this.timeOfDelete = timeOfDelete;
	}
}

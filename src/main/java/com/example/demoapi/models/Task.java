package com.example.demoapi.models;

import javax.persistence.*;

import com.example.demoapi.utils.TaskStatus;

@SuppressWarnings({ "serial" })
@Entity @Table(name = "Tab_Demo_Api_Tasks")
public class Task extends StandardFields {
	
	@Id @Column(nullable = false, length = 36)
	private String id;
	
	@Column(nullable = false, length = 20)
	private String title;
	
	@Column(nullable = true)
	private String description;
	
	@Column(nullable = false, length = 15) @Enumerated(EnumType.STRING)
	private TaskStatus status;

	public Task() {}
	
	public String getId() {
		return id; 
	}
	public void setId(String id) {
		this.id = id;
	}

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

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	
}

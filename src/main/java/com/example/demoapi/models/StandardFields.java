package com.example.demoapi.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class StandardFields implements Serializable {
	
	private static final long serialVersionUID = 1L;

//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id; 
	
	@Column(nullable = false, length = 60)
	private String createdBy;
	
	@Column(nullable = true, length = 60)
	private String updatedBy;
	
	@Column(nullable = true, columnDefinition = "DATETIME")
	private Date createdAt;
	 
	@Column(nullable = true, columnDefinition = "DATETIME")
	private Date updatedAt;
	   
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	} 
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}

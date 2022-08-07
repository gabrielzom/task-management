package com.example.demoapi.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoapi.dto.CreateTaskDto;
import com.example.demoapi.dto.DeleteTaskDto;
import com.example.demoapi.dto.UpdateTaskStatusDto;
import com.example.demoapi.models.Task;
import com.example.demoapi.repositorys.TaskRepository;
import com.example.demoapi.utils.TaskStatus;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository repository;
	
	public List<Task> getTasks() {
		System.out.println("--- (service) returned all tasks");
		return repository.findAll();
	}
	
	public Optional<Task> getTaskById(String taskId) {
		System.out.println("--- (service) task returned");
		return repository.findById(taskId);
	}
	
	public Task createTask(CreateTaskDto taskToCreate) {
		Date dateTimeNow = new Date();
		Task task = new Task();
		task.setId(UUID.randomUUID().toString());
		task.setDescription(taskToCreate.getDescription());
		task.setTitle(taskToCreate.getTitle());
		task.setCreatedBy(taskToCreate.getUsername());
		task.setStatus(TaskStatus.OPEN);
		task.setCreatedAt(dateTimeNow);
		System.out.println("--- (controller) task created");
		return repository.save(task);
	}
	
	public Task updateTaskStatus(String taskId, UpdateTaskStatusDto updateTaskStatus) {
		Date dateTimeNow = new Date();
		Task taskToUpdateStatus = this.getTaskById(taskId).get();
		taskToUpdateStatus.setStatus(updateTaskStatus.getStatus());
		taskToUpdateStatus.setUpdatedBy(updateTaskStatus.getUsername());
		taskToUpdateStatus.setUpdatedAt(dateTimeNow);
		
		System.out.println("--- (service) task updated");
		return repository.save(taskToUpdateStatus);
	}
	
	public DeleteTaskDto deleteTaskById(String taskId) {
		repository.deleteById(taskId);
	
		Date dateTimeNow = new Date();
		DeleteTaskDto taskDeleted = new DeleteTaskDto();
		
		taskDeleted.setId(taskId);
		taskDeleted.setTimeOfDelete(dateTimeNow);
		
		System.out.println("--- (service) task deleted");
		return taskDeleted;
		
	}
	

}

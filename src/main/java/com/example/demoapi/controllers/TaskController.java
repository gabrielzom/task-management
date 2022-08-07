package com.example.demoapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoapi.dto.CreateTaskDto;
import com.example.demoapi.dto.CreateTaskResponseDto;
import com.example.demoapi.dto.DeleteTaskDto;
import com.example.demoapi.dto.UpdateTaskStatusDto;
import com.example.demoapi.dto.UpdateTaskStatusResponseDto;
import com.example.demoapi.models.Task;
import com.example.demoapi.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskService service;
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping
	public List<Task> getTasks() {
		System.out.println("--- (controller) returned all tasks");
		return service.getTasks();
	}
	
	@GetMapping("/{taskId}")
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Task> getTaskById(@PathVariable(value = "taskId") String taskId) {
		System.out.println("--- (controller) task returned");
		return service.getTaskById(taskId);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public CreateTaskResponseDto createTask(@RequestBody CreateTaskDto taskToCreate) {
		Task taskCreated = service.createTask(taskToCreate);
		CreateTaskResponseDto createTaskDto = new CreateTaskResponseDto();
		createTaskDto.setId(taskCreated.getId());
		createTaskDto.setStatus(taskCreated.getStatus());
		
		System.out.println("--- (controller) task created");
		return createTaskDto;
	}
	
	@PatchMapping("/{taskId}")
	@ResponseStatus(code = HttpStatus.MULTI_STATUS)
	public UpdateTaskStatusResponseDto updateTaskStatus(
		@PathVariable(value = "taskId") String taskId, 
		@RequestBody UpdateTaskStatusDto updateTaskStatus 
	) {
			Task task = service.updateTaskStatus(taskId, updateTaskStatus);
			UpdateTaskStatusResponseDto taskUpdated = new UpdateTaskStatusResponseDto();
			taskUpdated.setId(taskId);
			taskUpdated.setStatus(updateTaskStatus.getStatus());
			taskUpdated.setTimeOfUpdated(task.getUpdatedAt());
			System.out.println("--- (controller) task updated");
			return taskUpdated;	
	}
 
	@DeleteMapping("/{taskId}")
	@ResponseStatus(code = HttpStatus.OK)
	public DeleteTaskDto deleteTaskById(@PathVariable(value = "taskId") String taskId) {
		System.out.println("--- (controller) task deleted");
		return service.deleteTaskById(taskId);
	}
}

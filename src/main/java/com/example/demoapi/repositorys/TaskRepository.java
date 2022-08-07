package com.example.demoapi.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoapi.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, String>{
	
}

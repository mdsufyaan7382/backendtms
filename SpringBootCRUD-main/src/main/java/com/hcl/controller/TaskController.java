package com.hcl.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Task;
import com.hcl.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService s;

	@GetMapping("/")

	public String welcomemsg() {
		return s.Welcome();
	}

	@GetMapping("/getTask")

	public List<Task> listUser() {
		return s.getAllTask();
	}

	@PostMapping("/addTask")

	public void addTask(Task t) {
		s.addAllTask(t);
	}

	@PutMapping("/updateTask")

	public void updateTask(Task t) {
		s.updateAllTask(t);
	}

	@DeleteMapping("/task/{taskid}")
	public void deleteTask(@PathVariable("taskid") int taskid) {
		s.delete(taskid);
	}

}

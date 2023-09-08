package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import com.hcl.entity.Employee;
import com.hcl.entity.Task;
//import com.hcl.repository.IEmployee;
import com.hcl.repository.ITask;


@org.springframework.stereotype.Service
public class TaskService {
//	@Autowired
//	 IEmployee Repo;
	@Autowired
	 ITask Repo1;
	
	
	public String Welcome() {
		return "Welcome to Spring Boot Task Management System Project with JPA & MYSQL";
}
//	public List<Employee> getAllEmployee(){
//		return Repo.findAll();
//	}
//	public void addAllEmployee(Employee e){
//		 Repo.save(e);
//	}
	
	public List<Task> getAllTask(){
		return Repo1.findAll();
	}
	
	public void addAllTask(Task t) {
		Repo1.save(t);
	}
	public void updateAllTask(Task t) {
		Repo1.save(t);
	}
	
	public void delete(int id) {
		Repo1.deleteById(id);
	}
	
	
}

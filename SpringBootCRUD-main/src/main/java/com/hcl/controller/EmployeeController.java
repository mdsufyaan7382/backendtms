//package com.hcl.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hcl.entity.Employee;
//import com.hcl.service.Service;
//
//
//@RestController
//public class EmployeeController {
//
//	@Autowired
//	private Service s;
//	
//	@GetMapping("/")
//	
//	public String Welcomemsg() {
//		 return s.Welcome();
//	
//	}
//	
//	@GetMapping("/getEmployee")
//		
//		public List<Employee> listEmployee(){
//			return s.getAllEmployee();
//			
//		}
//	@PostMapping("/addEmployee")
//	
//	public void addEmployee(Employee e){
//		s.addAllEmployee(e);
//		
//	}
//	}

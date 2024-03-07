package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/employee")// it will help us to reduce the port end points and to change the port no
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@GetMapping("/getallemployees")
	public List<Employee_Entity> get() {
		return es.get();
	}
	@GetMapping("/getByEmpId/{a}")
	public Optional<Employee_Entity> getById(@PathVariable("a") int id) {
		return es.getById(id);
	}

	@PostMapping("/createemployee")
	public String saveEmp(@RequestBody Employee_Entity e) {
		return es.saveEmp(e);
	} 

	@PostMapping("/createMulipleEmp")
	public String saveMulEmp(@RequestBody List<Employee_Entity> d) {
		return es.saveMulEmp(d);
	}
	@DeleteMapping("/deleteMultemp")
	public String deleteMulEmp() {
		return es.deleteMulEmp();
	}
	
	@DeleteMapping("/deleteByIDEmp/{a}")
	public String deleteEmp(@PathVariable("a") int id)  {
		return es.deleteEmp(id);
	}
	@PutMapping("/Update/{i}") 
	public String Update(@PathVariable int i,@RequestBody Employee_Entity e) {
		return es.UpdateService(i,e);
	}
////	-------------------------------------------
//	@GetMapping(value="/getBySalary/{sal1}/{sal2}")
//	public List<Employee_Entity> getBySal(@PathVariable int sal1,@PathVariable int sal2) {
//		return es.getBySal(sal1,sal2);
//		
//	}
	 	
	
		
		
	}


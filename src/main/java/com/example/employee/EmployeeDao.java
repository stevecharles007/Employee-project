package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepo er;

	public List<Employee_Entity> get() {
		return er.findAll();
	}

	public Optional<Employee_Entity> getById(int id) {
		return er.findById(id);
	}

	public String saveEmp(Employee_Entity e) {
		er.save(e);
		return "success";

	}

	public String saveMulEmp(List<Employee_Entity> d) {
		er.saveAll(d);
		return "Success bb";
	}

	public String deleteEmp(int id) {
		er.deleteById(id);
		return "Deleted one emp obj";
	}

	public String deleteMulEmp() {
		er.deleteAll();
		return "Deleted";
	}
	
	public String updateEmp(int id,Employee_Entity e) {
//		Optional<Employee_Entity> e1=er.findById(id);
		Employee_Entity e1=er.findById(id).get();
		e1.setName(e.getName());
		er.save(e1);
		return "Updated";
	}

//	public List<Employee_Entity> getBySal(int sal1, int sal2) {
//		
//		return er.getBySal(sal1,sal2);
//	}
}

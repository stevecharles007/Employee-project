package com.example.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public List<Employee_Entity> get() {
		return ed.get();
	}
	public Optional<Employee_Entity> getById(int id) {
		return ed.getById(id);
	}

	public String saveEmp(Employee_Entity e) {
		return ed.saveEmp(e);
	}

	public String saveMulEmp(List<Employee_Entity> d) {
		return ed.saveMulEmp(d);
	}

	public String deleteEmp(int id) {
		return ed.deleteEmp(id);
	}
	public String deleteMulEmp() {
		return ed.deleteMulEmp();
	}
	public String UpdateService(int a,Employee_Entity e) {
		return ed.updateEmp(a,e);
	}
//	public List<Employee_Entity> getBySal(int sal1, int sal2) {
//		
//		return ed.getBySal(sal1,sal2);
//	}

}

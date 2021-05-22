package com.mindtree.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.springrest.entities.Emp;
import com.mindtree.springrest.service.EmpService;

@RestController
public class Controllers {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/getemps")
	public List<Emp> getEmps(){
		return this.service.getEmps();
	}
	
	@GetMapping("/getemp/{empId}")
	public Optional<Emp> getEmp(@PathVariable Integer empId) {
		return this.service.getEmp(empId);
	}
	
	@PostMapping("/addemp")
	public Emp addEmp(@RequestBody Emp emp) {
		
		return this.service.addEmp(emp);
	}
	@PutMapping("/updateEmp")
	public Emp updateEmp(@RequestBody Emp emp) {
		return this.service.updateEmp(emp);
	}
	
	@DeleteMapping("/deleteemp/{empId}")
	public void deleteEmp(@PathVariable Integer empId) {
		this.service.deleteEmp(empId);
	}
	

}

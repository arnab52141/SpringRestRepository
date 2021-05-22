package com.mindtree.springrest.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.springrest.entities.Emp;

public interface EmpService {
	
	public List<Emp> getEmps();
	
	public Optional<Emp> getEmp(Integer empId);
	
	public Emp addEmp(Emp emp);
	
	public Emp updateEmp(Emp emp);
	
	public void deleteEmp(Integer empId);

}

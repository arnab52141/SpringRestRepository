package com.mindtree.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.springrest.dao.EmpDao;
import com.mindtree.springrest.entities.Emp;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDao empdao;

	@Override
	public List<Emp> getEmps() {   
		return empdao.findAll();
	}

	@Override
	public Optional<Emp> getEmp(Integer empId) {
		return empdao.findById(empId);
	}

	@Override
	public Emp addEmp(Emp emp) {
		empdao.save(emp);
		return emp;
	}

	@Override
	public Emp updateEmp(Emp emp) {

		empdao.save(emp);
		return emp;
	}

	@Override
	public void deleteEmp(Integer empId) {
		
		Emp e = empdao.getOne(empId);
		empdao.delete(e);
	}
}

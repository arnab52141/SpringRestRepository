package com.mindtree.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.springrest.entities.Emp;

public interface EmpDao extends JpaRepository<Emp, Integer>{
	
}

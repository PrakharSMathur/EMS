package com.example.EmployeeMgmt.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMgmt.model.Employee;
import com.example.EmployeeMgmt.model.EmployeeHrRequest;
import com.example.EmployeeMgmt.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository er;
	
	public Employee getEmployee(String empId) {
		// TODO Auto-generated method stub
		Employee e = er.findById(empId).get();
		return e;
	}

	public void changeEmpPassword(Employee emp, String empId) {
		
		// TODO Auto-generated method stub
		if(er.existsById(empId)) {
			Employee e = er.findById(empId).get();
			if(e.getPassword()!=null) {
				e.setPassword(emp.getPassword());;
			}
			er.save(e);
		}
		
	}

	public String viewIncrementalStatus(String empId) {
		// TODO Auto-generated method stub
		String s = "No Incremental status";

		if(er.existsById(empId)) {
		Employee e = er.findByEmpId(empId);
		
		s =  e.getIncrement_status();
		}
		return s;
	}

	

}

package com.example.EmployeeMgmt.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMgmt.model.EmployeeLeaves;
import com.example.EmployeeMgmt.repository.EmployeeLeavesRepository;

@Service
public class EmployeeLeavesService {

	@Autowired
	EmployeeLeavesRepository elr;
	public EmployeeLeaves viewLeaveStatus(int id) {
		// TODO Auto-generated method stub
		if(elr.existsById(id)) {
		return elr.findById(id).get();
		}
		else {
			return null;
		}
	}

}

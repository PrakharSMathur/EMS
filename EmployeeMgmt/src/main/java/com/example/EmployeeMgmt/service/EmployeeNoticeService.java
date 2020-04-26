package com.example.EmployeeMgmt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMgmt.model.EmployeeNotice;
import com.example.EmployeeMgmt.repository.EmployeeNoticeRepository;

@Service
public class EmployeeNoticeService {
	
	@Autowired
	public EmployeeNoticeRepository enr;

	public ArrayList<EmployeeNotice> viewEmpMsg(String empId) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeNotice> a = new ArrayList<EmployeeNotice>();
		if(enr.existsById(empId)) {
		a.add(enr.findById(empId).get());
		}
		return a;
	}
	
}

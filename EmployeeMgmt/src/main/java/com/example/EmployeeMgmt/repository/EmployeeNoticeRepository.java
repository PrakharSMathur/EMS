package com.example.EmployeeMgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeMgmt.model.EmployeeNotice;

import java.util.ArrayList;

public interface EmployeeNoticeRepository extends MongoRepository<EmployeeNotice,String> {

    ArrayList<EmployeeNotice> getEmpMsgByEmpId(String empId);
}

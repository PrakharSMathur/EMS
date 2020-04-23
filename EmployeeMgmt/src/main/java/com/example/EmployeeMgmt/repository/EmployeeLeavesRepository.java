package com.example.EmployeeMgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeMgmt.model.EmployeeLeaves;

import java.util.Optional;

public interface EmployeeLeavesRepository extends MongoRepository<EmployeeLeaves,Integer>{

    void deleteById(String empId);

    Optional<EmployeeLeaves> findById(String empId);
}

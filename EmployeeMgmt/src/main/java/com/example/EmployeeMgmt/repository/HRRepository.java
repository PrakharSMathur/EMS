package com.example.EmployeeMgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeMgmt.model.HR;

import java.util.Optional;

public interface HRRepository extends MongoRepository<HR,Integer>{

    boolean existsById(String hrId);

    void deleteById(String hrId);

    Optional<HR> findById(String hrId);

    Optional<HR> findByName(String name);
}

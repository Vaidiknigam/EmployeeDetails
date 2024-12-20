package com.example.EmployeeDetails.repository;


import com.example.EmployeeDetails.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
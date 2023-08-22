package com.example.spring.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Employee;



public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	boolean existsByEmail(String email);
	Optional<Employee> findById(Long id);

}
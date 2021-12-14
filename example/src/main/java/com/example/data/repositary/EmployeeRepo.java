package com.example.data.repositary;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.data.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}


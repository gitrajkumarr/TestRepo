package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.model.Employee;
import com.example.data.repositary.EmployeeRepo;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
    private EmployeeRepo repo;
     
    public List<Employee> listAll() {
        return repo.findAll();
    }
     
    public void save(Employee product) {
        repo.save(product);
    }
     
    public Employee get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}

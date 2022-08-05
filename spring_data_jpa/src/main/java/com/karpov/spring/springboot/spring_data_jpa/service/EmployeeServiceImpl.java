package com.karpov.spring.springboot.spring_data_jpa.service;



import com.karpov.spring.springboot.spring_data_jpa.dao.EmployeeRepository;
import com.karpov.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;


    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> optional = repository.findById(id);
        if (optional.isPresent()){
            employee = optional.get();
        } else {
            System.out.println("Mistake");
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employees = repository.findAllByName(name);
        return employees;
    }
}

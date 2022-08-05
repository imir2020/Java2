package com.imir.spring.springboot.spring_course_springboot.service;

import com.imir.spring.springboot.spring_course_springboot.dao.EmployeeDAO;
import com.imir.spring.springboot.spring_course_springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;


    @Override
    @Transactional// Открытие и закрытие транзакций
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional// Открытие и закрытие транзакций
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional// Открытие и закрытие транзакций
    public Employee getEmployee(int id) {

        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional// Открытие и закрытие транзакций
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}

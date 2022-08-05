package ru.karpov.spring.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.karpov.spring.rest.entity.Employee;
import ru.karpov.spring.rest.dao.EmployeeDAO;
import ru.karpov.spring.rest.entity.Employee;

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

package com.imir.spring.springboot.spring_course_springboot.dao;

import com.imir.spring.springboot.spring_course_springboot.entity.Employee;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmpDAOImplement implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Employee> getAllEmployees() {
//        Session session = entityManager.unwrap(Session.class);
//        List<Employee> allEmployees = session.createQuery("from Employee",Employee.class).getResultList();
        // return allEmployees;
        // List<Employee> from_employee = session.createQuery("from Employee", Employee.class).getResultList();
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        // Session session = entityManager.unwrap(Session.class);
        // session.createQuery("from Employee", Employee.class).getResultList().add(employee);
        // session.saveOrUpdate(employee);

        /*saveOrUpdate(employee)||merge(employee)  - эти методы вставляют или
        обновляют данные объекта в базе данных
        */

      Employee newEmployee =   entityManager.merge(employee);
        employee.setId(newEmployee.getId());
    }

    @Override
    public Employee getEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);
           Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//
//        Query<Employee> query = session.createQuery("delete from Employee " +
//                "where id =:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();

        Query query = entityManager.createQuery("delete from Employee " +
                "where id =:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}

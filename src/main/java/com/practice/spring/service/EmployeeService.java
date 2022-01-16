package com.practice.spring.service;
import com.practice.spring.entity.Employee;
import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}

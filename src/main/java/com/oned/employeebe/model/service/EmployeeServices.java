package com.oned.employeebe.model.service;

import java.util.List;

import com.oned.employeebe.model.Employee;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}

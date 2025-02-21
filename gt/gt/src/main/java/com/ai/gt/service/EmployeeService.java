package com.ai.gt.service;

import com.ai.gt.dao.EmployeeDao;
import com.ai.gt.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void save() {
        System.out.println("EmployeeService: save");
        try{
            employeeDao.save();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public Employee getEmployeeById(int id) {
        Employee employee = employeeDao.getEmployeeById(id);
        System.out.println("EmployeeService: getEmployee");
        return employee;
    }
    public Employee getEmployeeByEmail(String email) {
        Employee employee = employeeDao.getEmployeeByEmail(email);
        System.out.println("EmployeeService: getEmployee");
        return employee;
    }

}

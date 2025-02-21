package com.ai.gt.dao;

import com.ai.gt.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    public void save() {
        System.out.println("EmployeeDao: save");
    }
    public Employee getEmployeeById(int id) {
        System.out.println("EmployeeDao: getEmployee");
        return new Employee(id, "John", "testing@test.com");
    }
    public Employee getEmployeeByEmail(String email) {
        System.out.println("EmployeeDao: getEmployee");
        return new Employee(123, "John", email);
    }

}

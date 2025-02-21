package com.ai.gt.controller;

import com.ai.gt.model.Employee;
import com.ai.gt.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void save() {
        System.out.println("EmployeeController: save");
        employeeService.save();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        System.out.println("EmployeeController: getEmployee");
        Employee employee = employeeService.getEmployeeById(id);

        return ResponseEntity.ok(employee);
    }
    @GetMapping("/")
    public ResponseEntity<Employee> getEmployeeByEmail(@RequestParam String email) {
        System.out.println("EmployeeController: getEmployee");
        Employee employee = employeeService.getEmployeeByEmail(email);

        return ResponseEntity.ok(employee);
    }
}

package com.challenge.api.service;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImplementation;
import java.time.Instant;
import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeService {

    private final Map<UUID, Employee> employeeStore = new HashMap<>();

    public EmployeeService() {
        // Mock employee data
        Employee emp1 = new EmployeeImplementation();
        emp1.setUuid(UUID.randomUUID());
        emp1.setFirstName("Elliot");
        emp1.setLastName("Beaver");
        emp1.setJobTitle("Software Engineer");
        emp1.setEmail("ebeaver917@gmail.com");
        emp1.setSalary(90000);
        emp1.setContractHireDate(Instant.now());
        employeeStore.put(emp1.getUuid(), emp1);

        Employee emp2 = new EmployeeImplementation();
        emp2.setUuid(UUID.randomUUID());
        emp2.setFirstName("John");
        emp2.setLastName("Smith");
        emp2.setJobTitle("Software Engineer II");
        emp2.setEmail("johnsmith99@gmail.com");
        emp2.setSalary(100000);
        emp2.setContractHireDate(Instant.now());
        employeeStore.put(emp2.getUuid(), emp2);
    }

    public List<Employee> getAllEmployees() {
        // Use ArrayList internally but expose as List to keep contract flexible
        return new ArrayList<>(employeeStore.values());
    }

    public Employee getEmployeeByUuid(UUID id) {
        Employee employee = employeeStore.get(id);
        if (employee == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No matching employee found with id: " + id);
        }
        return employee;
    }

    public Employee createEmployee(Employee request) {
        UUID uuid = UUID.randomUUID();
        request.setUuid(uuid);

        // Store the newly created employee into our faux-database
        employeeStore.put(uuid, request);
        return request;
    }
}

package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

/**
 * EmployeeImplementation class for storing actual Employee data, as the interface only
 * serves as a contract and not an implementation of an Employee.
 */
public class EmployeeImplementation implements Employee {

    private UUID uuid;
    private String firstName;
    private String lastName;
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant contractHireDate;
    private Instant contractTerminationDate;

    public EmployeeImplementation() {}

    @Override
    public UUID getUuid() {
        return uuid;
    }

    /**
     * @param uuid required non-null
     */
    @Override
    public void setUuid(UUID uuid) {
        if (uuid == null) throw new IllegalArgumentException("UUID cannot be null");
        this.uuid = uuid;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        // We can derive full name from first and last name
        String f = (firstName != null) ? firstName : "";
        String l = (lastName != null) ? lastName : "";
        return (f + " " + l).trim();
    }

    @Override
    public void setFullName(String name) {
        // Nothing needed here, getter handles it
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Instant getContractHireDate() {
        return contractHireDate;
    }

    /**
     * @param contractHireDate required non-null
     */
    @Override
    public void setContractHireDate(Instant contractHireDate) {
        if (contractHireDate == null) throw new IllegalArgumentException("Contract hire date cannot be null");
        this.contractHireDate = contractHireDate;
    }

    @Override
    public Instant getContractTerminationDate() {
        return contractTerminationDate;
    }

    @Override
    public void setContractTerminationDate(Instant contractTerminationDate) {
        this.contractTerminationDate = contractTerminationDate;
    }
}

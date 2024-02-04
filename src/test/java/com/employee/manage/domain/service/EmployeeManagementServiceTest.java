package com.employee.manage.domain.service;

import com.employee.manage.domain.entity.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagementServiceTest {
    EmployeeManagementService employeeManagementService = new EmployeeManagementService();

    @Test
    void addEmployee() {
        Address address = new Address("PO Box 7703", "100th", "Urbandale", State.IOWA, "50323", Country.UNITED_STATES);
        JobDetails jobDetails = new JobDetails("Software Engineer", new Date());
        Employee newEmployee = employeeManagementService.addEmployee("Susanna", "Shenouda", address, jobDetails, MartialStatus.SINGLE);
        assertNotNull(employeeManagementService.findEmployee(newEmployee.getId()));
    }


    @Test
    void updateEmployee() {
        Address address = new Address("PO Box 7703", "100th", "Urbandale", State.IOWA, "50323", Country.UNITED_STATES);
        JobDetails jobDetails = new JobDetails("Software Engineer", new Date());
        Employee newEmployee = employeeManagementService.addEmployee("Caleb", "Shenouda", address, jobDetails, MartialStatus.SINGLE);

        Employee updatedEmployee = employeeManagementService.updateEmployee(newEmployee.getId(), "Daniel", "Shenouda", address, jobDetails, MartialStatus.MARRIED);
        assertEquals("Daniel", updatedEmployee.getFirstName());
    }

    @Test
    void deleteEmployee() {
        Address address = new Address("PO Box 7703", "100th", "Urbandale", State.IOWA, "50323", Country.UNITED_STATES);
        JobDetails jobDetails = new JobDetails("Software Engineer", new Date());
        Employee newEmployee = employeeManagementService.addEmployee("Nehemiah", "Shenouda", address, jobDetails, MartialStatus.SINGLE);

        Employee deletedEmployee = employeeManagementService.deleteEmployee(newEmployee.getId());
        assertNull(employeeManagementService.findEmployee(deletedEmployee.getId()));
    }
}
package com.employee.manage.domain.service;

import com.employee.manage.domain.entity.Address;
import com.employee.manage.domain.entity.Employee;
import com.employee.manage.domain.entity.JobDetails;
import com.employee.manage.domain.entity.MartialStatus;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementService {
 //test
    private static Map<String, Employee> EMPLOYEES_DATABASE = new HashMap();

    public static Employee addEmployee(String fName, String lName, Address address, JobDetails jobDetails, MartialStatus martialStatus) {
        Employee employee = new Employee(fName, lName, address, jobDetails, martialStatus);
        EMPLOYEES_DATABASE.put(employee.getId(), employee);
        return employee;
    }

    public static Employee updateEmployee(String id, String fName, String lName, Address address, JobDetails jobDetails, MartialStatus martialStatus) {
        Employee employee = EMPLOYEES_DATABASE.get(id);
        employee.setFirstName(fName);
        employee.setLastName(lName);
        employee.setAddress(address);
        employee.setJobDetails(jobDetails);
        employee.setMartialStatus(martialStatus);
        EMPLOYEES_DATABASE.put(employee.getId(), employee);
        return employee;
    }


    public static Employee deleteEmployee(String id) {
        Employee employee = EMPLOYEES_DATABASE.remove(id);
        return employee;
    }

}

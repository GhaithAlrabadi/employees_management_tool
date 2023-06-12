package com.employee.manage.domain.entity;

public class Employee {
    private String firstName;
    private String lastName;
    private Address address;
    private JobDetails jobDetails;

    public Employee(String firstName, String lastName, Address address, JobDetails jobDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.jobDetails = jobDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public JobDetails getJobDetails() {
        return jobDetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", jobDetails=" + jobDetails +
                '}';
    }
}

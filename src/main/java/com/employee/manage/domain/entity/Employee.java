package com.employee.manage.domain.entity;

import java.util.UUID;

public class Employee {
    private String firstName;
    private String lastName;
    private Address address;
    private JobDetails jobDetails;
    private MartialStatus martialStatus;

    private String id;

    public Employee(String firstName, String lastName, Address address, JobDetails jobDetails, MartialStatus martialStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.jobDetails = jobDetails;
        this.martialStatus = martialStatus;
        this.id = UUID.randomUUID().toString();
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

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMartialStatus(MartialStatus martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", jobDetails=" + jobDetails +
                ", martialStatus=" + martialStatus +
                ", id='" + id + '\'' +
                '}';
    }
}

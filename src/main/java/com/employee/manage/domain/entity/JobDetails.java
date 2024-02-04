package com.employee.manage.domain.entity;

import java.util.Date;

public class JobDetails {

    private String occupation;
    private Date hireDate;

    public JobDetails(String occupation, Date hireDate) {
        this.occupation = occupation;
        this.hireDate = hireDate;
    }

    public String getOccupation() {
        return occupation;
    }

    public Date getHireDate() {
        return hireDate;
    }

}

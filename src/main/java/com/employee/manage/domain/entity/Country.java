package com.employee.manage.domain.entity;

public enum Country {
    CANADA("Canada"),
    UNITED_STATES("United States"),
    MEXICO("Mexico");
    private final String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

}

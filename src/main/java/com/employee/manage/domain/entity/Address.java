package com.employee.manage.domain.entity;

public class Address {
    private String name;
    private String streetAddress;
    private String city;
    private State state;
    private String zipCode;

    private Country country;

    public Address(String name,
                   String streetAddress,
                   String city,
                   State state,
                   String zipCode, Country country) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zipCode='" + zipCode + '\'' +
                ", country=" + country +
                '}';
    }
}

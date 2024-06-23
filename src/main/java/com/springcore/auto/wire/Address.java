package com.springcore.auto.wire;

public class Address {
    
    private String city;
    private String state;
    private String country;
    
    public Address(String city, String state, String country) {
        super();
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address() {
        super();
    }


    //Getter and setters


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", state=" + state + "]";
    }

}

package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    
    private int id;
    private String name;
    // @Autowired
    private Address address;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    @Autowired
    @Qualifier("address2")
    public void setAddress(Address address) {
        System.out.println("Inside Setter Method");
        this.address = address;
    }

    public Employee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Employee() {
        super();
    }
    // @Autowired
    // public Employee(  @Qualifier("address2") Address address)
    public Employee( Address address)
    {
        super();
        this.address=address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + ", id=" + id + ", name=" + name + "]";
    }
}

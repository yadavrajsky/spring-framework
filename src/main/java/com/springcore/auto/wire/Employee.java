package com.springcore.auto.wire;

public class Employee {
    
    private int id;
    private String name;
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
    public void setAddress(Address address) {
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

    public Employee(Address address)
    {
        super();
        this.address=address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + ", id=" + id + ", name=" + name + "]";
    }
}

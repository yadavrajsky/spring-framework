package com.springcore.lifecycle;

public class LifeCycle {

    private String name;

    public LifeCycle() {
        super();
        System.out.println("Inside the constructor of LifeCycle");
    }

    public LifeCycle(String name) {        
        this.name = name;
        System.out.println("Inside the constructor of LifeCycle");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside the setter method of LifeCycle");
        this.name = name;
    }

    public void init() {
        System.out.println("Inside the init method of LifeCycle");
    }

    public void destroy() {
        System.out.println("Inside the destroy method of LifeCycle");
    }

    @Override
    public String toString() {
        return "LifeCycle [name=" + name + "]";
    }

}

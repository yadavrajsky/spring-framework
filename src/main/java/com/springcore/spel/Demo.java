package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{11+22}")
    private int x;
    @Value("#{11+33}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double  z;
    @Value("#{new java.lang.String('Akash Yadav')}")
    private String name;
    @Value("#{8>3}")
    private boolean isActive;
    public Demo() {
        super();
    }

    public Demo(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return y;
    }
    public void setZ(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo [x=" + x + ", y=" + y + "z="+z+" name=" + name +" isArticle="+ isActive+ "]";
    }

}

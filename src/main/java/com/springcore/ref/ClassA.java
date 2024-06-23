package com.springcore.ref;

public class ClassA {
    
    private ClassB objB;
    private  int x;

    public ClassA() {
        super();
    }
    //setter and getters

    public ClassB getObjB() {
        return objB;
    }

    public void setObjB(ClassB objB) {
        this.objB = objB;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "ClassA [objB=" + objB + ", x=" + x + "]";
    }
}

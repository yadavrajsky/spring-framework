package com.springcore.ref;

public class ClassB {
    private int y;

    public ClassB() {
        super();
    }

    public ClassB(int y) {
        super();
        this.y = y;
    }

    //setter and getters

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ClassB [y=" + y + "]";
    }
}

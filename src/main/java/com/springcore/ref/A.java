package com.springcore.ref;

public class A {
    private int x;
    B obj;

    public A() {
        super();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    public int getX() {
        return x;
    }

    public B getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", obj=" + obj +
                '}';
    }
}

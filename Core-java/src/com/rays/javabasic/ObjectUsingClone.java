package com.rays.javabasic;

public class ObjectUsingClone implements Cloneable {
    public void display() {
        System.out.println("Object created using clone()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ObjectUsingClone original = new ObjectUsingClone();
            ObjectUsingClone clone = (ObjectUsingClone) original.clone();
            clone.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

package com.akalanka.microservice.lectureManagementservice;

public class Lecture {
    private int maximum;
    private int minimum;

    public Lecture(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}

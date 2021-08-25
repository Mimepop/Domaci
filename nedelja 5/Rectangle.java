package Sreda1;

import java.awt.*;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        double P = a * b;
        return P;
    }

    @Override
    public double circumference() {
        double O = 2 * (a + b);
        return O;

    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                +"--------------------";
    }
}
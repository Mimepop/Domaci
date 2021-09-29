package Sreda1;

public class Triangle extends Shape{
    private double a, b, c;


    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double S=(a+b+c)/2;
        double P = Math.sqrt(S*(S-a)*(S-b)*(S-c));
        return P;
    }
    @Override
    public double circumference() {

        double O = a + b + c;
        return O;

    }

    @Override
    public String toString() {
        return super.toString() + "\n"
               +"--------------------";
    }

}

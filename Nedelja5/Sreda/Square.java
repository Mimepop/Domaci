package Sreda1;

public class Square extends Rectangle {


    public Square(String name, double a, double b) {
        super(name, a, b);
    }

    @Override
    public double circumference() {
        if (getA() == getB()) {
            double O = 4 * getA();
            return O;
        } else {

            return 0;
        }
    }

    @Override
    public double area() {
        if (getA() == getB()) {
            double P = Math.pow(getA(), 2.0);
            return P;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "--------------------";
    }

}

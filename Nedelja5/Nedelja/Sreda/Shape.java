package Sreda1;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double circumference();



    public abstract double area();


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {

        return "Shape: "+name+"\n"
                +"Circumference: "+circumference()+"\n"
                +"Area: "+area();
    }


}

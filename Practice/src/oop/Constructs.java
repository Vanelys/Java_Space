package oop;

public class Constructs {
    private String color;
    private static final double PI = 3.141592;

    //constructors still have to utilize setter and getter to write and output values.
    public Constructs() {
        this.setColor("Green");
    }

    public Constructs(String c) {
        this.setColor(c);
    }

    //since the setting is being controlled by the constructor, setter can be private
    private void setColor(String c) {
        this.color = c;
    }
    public String getColor() {
        return color;
    }
}

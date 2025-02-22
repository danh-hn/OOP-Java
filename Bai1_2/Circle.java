package Bai1_2;

public class Circle {
    private double radius;


    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return String.format("Circle[radius = %.2f]", this.radius);
    }
}



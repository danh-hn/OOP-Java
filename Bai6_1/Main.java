package Bai6_1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "black", true);
        c1.setRadius(2);
        c1.setColor("blue");
        System.out.println(c1);
        System.out.println("Area:"+ c1.getArea());
        System.out.println("Perimeter: "+c1.getPerimeter());

        Rectangle r1 = new Rectangle(5, 10, "yellow", true);
        r1.setColor("black");
        System.out.println(r1);
        System.out.println("Area:"+ r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter());

    }
}
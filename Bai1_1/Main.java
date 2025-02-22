package Bai1_1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Bán kính: "+ circle1.getRadius() + " Diện tích: " + circle1.getArea());
        Circle circle2 = new Circle(2.0, "black");
        System.out.println("Bán kính: "+ circle2.getRadius() + "Diện tích: " + circle2.getArea());
    }
}
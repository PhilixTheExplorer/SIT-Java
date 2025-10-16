import java.util.Scanner;

public class CircleDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        double radius = sc.nextDouble();
        c.setRadius(radius);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());
    }
}

class Circle {
    // Write your code here
    double radius;

    double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

    double getRadius() {
        return radius;
    }
}
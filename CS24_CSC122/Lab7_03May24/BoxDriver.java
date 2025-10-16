import java.util.Scanner;

public class BoxDriver {

  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int box = sc.nextInt();
    if (box != 0) {
      for (int i = 0; i < box; i++) {
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();
        Box b = new Box(width, height, depth);
        System.out.println("Capacity: " + b.getCapacity());
        System.out.println("Surface area: " + b.getArea());
      }
    } else {
      Box b = new Box();
      System.out.println("Default Box is Created");
      System.out.println("Capacity: " + b.getCapacity());
      System.out.println("Surface area: " + b.getArea());
    }
  }
}

class Box {

  public static final double ONE_UNIT = 1.0;
  double width = ONE_UNIT;
  double height = ONE_UNIT;
  double depth = ONE_UNIT;

  public Box() {}

  public Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public double getCapacity() {
    return width * height * depth;
  }

  public double getArea() {
    return 2 * (width * depth) + 2 * (width * height) + 2 * (height * depth);
  }
}

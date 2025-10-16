import java.util.Scanner;

public class PyramidDriver {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double height = sc.nextDouble();
    double slantheight = sc.nextDouble();
    double basewidth = sc.nextDouble();
    Pyramid p = new Pyramid(height, slantheight, basewidth);
    System.out.println("Volumn: " + p.getVolumn());
    System.out.println("Surface area: " + p.getArea());
  }
}

class Pyramid {

  //put your code here
  private double height;
  private double slantheight;
  private double basewidth;

  public Pyramid(double height, double slantheight, double basewidth) {
    this.height = height;
    this.slantheight = slantheight;
    this.basewidth = basewidth;
  }

  public double getVolumn() {
    return (basewidth * basewidth) * height / 3;
  }

  public double getArea() {
    return (basewidth * basewidth) + (4 * ((basewidth * slantheight) / 2));
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c1 = sc.nextDouble();
    double c2 = sc.nextDouble();
    double radian = sc.nextDouble();
    double x = (a + b) / 2;
    double tolerance = (b - a) / 2;
    System.out.print(biSection(a, b, c1, c2, radian, x, tolerance));
  }

  public static double formula(double c1, double c2, double x) {
    return c1 + c2 * (x - Math.sin(x));
  }

  public static double biSection(double a, double b, double c1, double c2, double radian, double x, double tolerance) {
    if (tolerance < radian) {
      return x;
    }
    double funA = formula(c1, c2, a);
    double funX = formula(c1, c2, x);
    if (funA * funX < 0) {
      return biSection(a, x, c1, c2, radian, (a + x) / 2, (x - a) / 2);
    } else if (funA * funX > 0) {
      return biSection(x, b, c1, c2, radian, (x + b) / 2, (b - x) / 2);
    }
    return x;
  }
}

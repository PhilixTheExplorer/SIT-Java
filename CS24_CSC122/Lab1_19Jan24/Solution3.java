import java.util.Scanner;

public class Solution3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // put your logic here
    int a = sc.nextInt();
    String s = sc.next();
    int b = sc.nextInt();
    switch (s) {
      case "+":
        System.out.println(a + b);
        break;
      case "-":
        System.out.println(a - b);
        break;
      case "*":
        System.out.println(a * b);
        break;
      case "/":
        System.out.println(b != 0 ? a / b : "Error");
        break;
      default:
        System.out.println("Error");
        ;
    }
  }
}

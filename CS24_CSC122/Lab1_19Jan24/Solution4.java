import java.util.Scanner;

public class Solution4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = a.equals("A") ? "B" : "A";
    int n = sc.nextInt();
    int round = (int) Math.round(Math.sqrt(n));
    if (n <= round * round) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }
  }
}

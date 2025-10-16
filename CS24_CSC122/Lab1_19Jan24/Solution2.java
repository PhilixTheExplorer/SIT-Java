import java.util.Scanner;

public class Solution2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(";");
    for (String x : s) {
      String r = Character.toUpperCase(x.charAt(0)) + x.substring(1);
      System.out.print(r + " ");
    }
  }
}

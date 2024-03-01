import java.util.Scanner;

public class Solution1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int left = 0;
    int right = s.length();
    if (s.length() % 2 == 0) {
      System.out.println("Invalid word input");
    } else {
      for (int i = 0; i < s.length(); i++) {
        if (left == right - 1) {
          System.out.println(" ".repeat(left) + s.charAt(left) + "");
        } else if (left < right) {
          String leftStr = " ".repeat(left) + s.charAt(left) + "";
          String midStr = " ".repeat(right - (left + 1) - 1) + "";
          String rightStr = s.charAt(right - 1) + "";
          System.out.println(leftStr + midStr + rightStr);
        } else if (left > right) {
          String leftStr = " ".repeat(right - 1) + s.charAt(right - 1) + "";
          String midStr = " ".repeat(left - right);
          String rightStr = s.charAt(left) + "";
          System.out.println(leftStr + midStr + rightStr);
        }
        left++;
        right--;
      }
    }
  }
}

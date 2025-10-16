import java.util.Scanner;

public class Solution2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sword = 0;
    int shield = 0;
    int helmet = 0;
    if (n >= 21) {
      int temp = n / 21;
      sword += temp;
      shield += temp;
      helmet += temp;
      n %= 21;
    }
    if (n >= 10) {
      int temp = n / 10;
      sword += temp;
      n %= 10;
    }
    if (n >= 8) {
      int temp = n / 8;
      shield += temp;
      n %= 8;
    }
    if (n >= 3) {
      int temp = n / 3;
      helmet += temp;
      n %= 3;
    }
    System.out.println(sword + " " + shield + " " + helmet + " " + n);
  }
}

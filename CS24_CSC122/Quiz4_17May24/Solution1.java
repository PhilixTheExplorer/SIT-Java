import java.util.*;

public class Solution1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    int cost = 0;
    for (int i = 1; i <= w; i++) {
      cost += i * k;
    }
    if (n < cost) System.out.println(cost - n); else System.out.println(0);
    sc.close();
  }
}

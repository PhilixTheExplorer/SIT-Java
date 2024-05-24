import java.util.*;

public class Solution1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int mid = Integer.parseInt(input.charAt(4) + "");
    boolean type = mid % 2 == 0;
    int result = 0;
    for (int i = 0; i < input.length(); i++) {
      if ((i % 2 == 0) == type) result += Integer.parseInt(input.charAt(i) + "");
    }
    System.out.println(result);
    sc.close();
  }
}

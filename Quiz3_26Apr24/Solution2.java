import java.util.*;

public class Solution2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    boolean flag = true;
    int i = 0;
    int j = 1;
    while (j < s.length() && flag) {
      flag = s.charAt(i) <= s.charAt(j);
      i++;
      j++;
    }
    System.out.println(flag);
  }
}

import java.util.HashSet;
import java.util.Scanner;

public class Solution4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      String number = sc.next();
      HashSet<Character> set = new HashSet<>();
      for (int j = 0; j < number.length(); j++) {
        set.add(number.charAt(j));
      }
      if (set.size() == number.length()) count++;
    }
    System.out.println(count);
    sc.close();
  }
}

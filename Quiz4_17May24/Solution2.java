import java.util.*;

public class Solution2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int count = 0;
    for (int i = 0; i < size; i++) {
      String n = sc.next();
      HashSet<Character> set = new HashSet<>();
      for (int j = 0; j < n.length(); j++) {
        set.add(n.charAt(j));
      }
      if (n.length() == set.size()) count++;
    }
    System.out.println(count);
    sc.close();
  }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toUpperCase();

    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      set.add(s.charAt(i) + "");
    }
    List<String> list = new ArrayList<String>(set);
    Collections.sort(list);
    for (String x : list) {
      System.out.print(x + " ");
    }
  }
}

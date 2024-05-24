import java.util.*;

public class Solution2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[] arr = new String[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.next();
      if (i % 2 == 0) arr[i] = reversedString(arr[i]).toUpperCase();
      else arr[i] = reversedString(arr[i]).toLowerCase();
    }
    for (String i : arr) System.out.print(i + " ");
    sc.close();
  }

  public static String reversedString(String a) {
    StringBuilder sb = new StringBuilder(a);
    return sb.reverse().toString();
  }
}

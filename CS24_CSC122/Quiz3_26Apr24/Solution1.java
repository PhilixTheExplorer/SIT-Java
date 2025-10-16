import java.util.*;

public class Solution1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sa = new StringBuilder(sc.next());
    StringBuilder sb = new StringBuilder(sc.next());
    sc.close();
    int ra = Integer.parseInt(sa.reverse().toString());
    int rb = Integer.parseInt(sb.reverse().toString());
    System.out.println(ra + rb);
  }
}

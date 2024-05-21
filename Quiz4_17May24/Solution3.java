import java.util.*;

public class Solution3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int maxArea = 0;
    for (int left = 0; left < n - 1; left++) {
      for (int right = left; right < n; right++) {
        int area = (right - left) * Math.min(arr[left], arr[right]);
        maxArea = Math.max(maxArea, area);
      }
    }
    System.out.println(maxArea);
    sc.close();
  }
}

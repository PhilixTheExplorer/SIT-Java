import java.util.*;

public class Solution3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
    for (int i = 0; i < arr.length - 1; i += 2) {
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
      System.out.print(arr[i] + " " + arr[i + 1] + " ");
    }
    if (size % 2 != 0) System.out.print(arr[arr.length - 1]);
    sc.close();
  }
}

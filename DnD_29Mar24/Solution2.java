import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int a = 0; a < n; a++) {
            arr[a] = sc.nextInt();
        }
        for (int a = 0; a < n - i; a++) {
            int tmp = arr[a];
            arr[a] = arr[a + i];
            arr[a + i] = tmp;
        }
        for (int x : arr) {
            System.out.print(x + " ");

        }
        sc.close();
    }
}
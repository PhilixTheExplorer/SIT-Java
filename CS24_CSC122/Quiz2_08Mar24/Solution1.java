import java.util.Scanner;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);
        double total = 0;

        for (int i = 1; i < n - 1; i++) {
            total += arr[i];
        }

        long result = Math.round(total / (n - 2));
        System.out.println(result);

    }
}
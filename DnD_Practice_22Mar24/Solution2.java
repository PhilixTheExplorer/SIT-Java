import java.util.Scanner;
import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);
        if (n % 2 != 0) {
            System.out.println(arr[n / 2]);
        } else {
            System.out.println(arr[n / 2 - 1] + " " + arr[n / 2]);
        }
        sc.close();
    }
}
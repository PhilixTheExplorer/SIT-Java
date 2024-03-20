import java.util.Scanner;
import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);

        sc.close();
        System.out.println(arr[n - 1] + " " + arr[n - 2] + " " + arr[n - 3]);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}

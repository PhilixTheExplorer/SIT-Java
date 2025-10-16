import java.util.Scanner;
import java.util.Arrays;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
            maxSum += arr[i + 1];
        }
        System.out.println(minSum + " " + maxSum);
        sc.close();
    }
}
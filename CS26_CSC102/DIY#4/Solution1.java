import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }
        double avg = total / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > avg) {
                count++;
            }
        }
        System.out.println("AVG: " + avg);
        System.out.println("No. above the AVG: " + count);
        sc.close();
    }
}
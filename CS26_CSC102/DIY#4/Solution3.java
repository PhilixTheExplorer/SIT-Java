import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[101];
        while (n != 0) {
            nums[n]++;
            n = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                System.out.println(i + " occurs " + nums[i] + " time" + (nums[i] == 1 ? "" : "s"));
            }
        }
        sc.close();
    }
}
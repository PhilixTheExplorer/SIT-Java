import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = sc.nextInt();
        }

        int longestStreak = 0;
        int currentStreak = 0;

        for (int step : steps) {
            if (step > 10000) {
                currentStreak++;
                longestStreak = Math.max(longestStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }

        System.out.println(longestStreak + " day" + (longestStreak > 1 ? "s" : ""));
        sc.close();
    }
}
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        String period = sc.next();

        if (period.equals("pm") && hour != 12) {
            hour += 12;
        } else if (period.equals("am") && hour == 12) {
            hour = 0;
        }

        System.out.print(String.format("%02d:%02d", hour, minute));
        sc.close();
    }

}
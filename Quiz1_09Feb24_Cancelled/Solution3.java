import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int century = 0;
        String suffix = "th";

        if (year % 100 == 0)
            century = year / 100;
        else
            century = (year / 100) + 1;

        // Adjust suffix for centuries ending in 11, 12, and 13
        if (!(century >= 11 && century <= 13)) {
            switch (century % 10) {
                case 1:
                    suffix = "st";
                    break;
                case 2:
                    suffix = "nd";
                    break;
                case 3:
                    suffix = "rd";
                    break;
            }
        }

        System.out.println(century + suffix);
        sc.close();
    }
}

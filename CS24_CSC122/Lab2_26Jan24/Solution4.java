import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int hour = Integer.parseInt(input[0]);
        if (input[2].equals("pm") && hour != 12) {
            hour += 12;
        } else if (input[2].equals("am") && hour == 12) {
            hour = 0;
        } else {
            hour += 0;
        }
        if (hour < 10)
            System.out.println("0" + hour + ":" + input[1]);
        else
            System.out.println(hour + ":" + input[1]);
    }
}

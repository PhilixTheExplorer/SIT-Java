import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current_state = sc.nextLine();
        String click = sc.nextLine();
        String next_state = "NEUTRAL";
        if (current_state.equals("1 0")) {
            if (click.equals("1 -"))
                next_state = "NEUTRAL";
            else if (click.equals("- 1"))
                next_state = "DnD";
            else
                next_state = "MuR";
        } else if (current_state.equals("0 1")) {
            if (click.equals("1 -"))
                next_state = "MuR";
            else if (click.equals("- 1"))
                next_state = "NEUTRAL";
            else
                next_state = "DnD";
        } else {
            if (click.equals("1 -"))
                next_state = "MuR";
            else if (click.equals("- 1"))
                next_state = "DnD";
        }
        System.out.println(next_state);
        sc.close();
    }
}
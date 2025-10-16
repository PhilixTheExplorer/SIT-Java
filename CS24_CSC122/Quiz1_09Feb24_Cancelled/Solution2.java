import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isValid = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        } else {
            isValid = false;
        }

        System.out.println(isValid);
        sc.close();
    }
}

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();
        int middleNum = num.charAt(4);
        int sum = 0;
        if (middleNum % 2 == 0) {
            for (int i = 0; i < 9; i += 2) {
                sum += Character.getNumericValue(num.charAt(i));
            }
        } else {
            for (int i = 1; i < 9; i += 2) {
                sum += Character.getNumericValue(num.charAt(i));
            }
        }
        System.out.println(sum);
    }
}

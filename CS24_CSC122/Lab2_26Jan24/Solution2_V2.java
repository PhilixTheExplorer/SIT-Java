import java.util.Scanner;

public class Solution2_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < input.length(); i++) {
            // To avoid index out of bound
            // Check condition first
            if (i + 2 < input.length() && input.substring(i, i + 3).equals("cat"))
                cat++;
            if (i + 2 < input.length() && input.substring(i, i + 3).equals("dog"))
                dog++;
        }
        System.out.println(cat == dog);
    }
}
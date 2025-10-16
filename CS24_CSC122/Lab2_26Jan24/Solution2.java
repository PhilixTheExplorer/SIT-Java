import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'a' && input.charAt(i + 2) == 't')
                cat++;
            if (input.charAt(i) == 'd' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 'g')
                dog++;
        }
        if (cat == dog)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

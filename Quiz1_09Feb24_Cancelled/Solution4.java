import java.util.HashSet;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String number = String.valueOf(sc.nextInt());
            HashSet<Character> set = new HashSet<>();
            boolean isUnique = true;
            for (int j = 0; j < number.length(); j++) {
                if (!set.add(number.charAt(j))) {
                    isUnique = false;
                }
            }
            if (isUnique)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
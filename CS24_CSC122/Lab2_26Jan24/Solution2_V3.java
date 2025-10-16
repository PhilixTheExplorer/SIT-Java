import java.util.Scanner;

public class Solution2_V3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        int cat = input.split("cat", -1).length;
        int dog = input.split("dog", -1).length;
        System.out.println(cat == dog);
    }
}
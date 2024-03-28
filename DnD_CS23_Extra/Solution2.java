import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        int last = seed + 20;
        int sum = 0;
        for (int i = seed; i <= last; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}

import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int p = 1;
        int d = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(p % 10);
                d++;
                if (d == n) {
                    p++;
                    d = 0;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
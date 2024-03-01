import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mat = new int[size];
        for (int i = 0; i < size; i++) {
            mat[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int f = sc.nextInt();
            int l = sc.nextInt();
            int tmp = mat[f];
            mat[f] = mat[l];
            mat[l] = tmp;
        }
        for (int x : mat) {
            System.out.print(x + " ");
        }
    }
}

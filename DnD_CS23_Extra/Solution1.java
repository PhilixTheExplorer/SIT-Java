import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int pair = sc.nextInt();
        for (int p = 0; p < pair; p++) {
            int firstIndex = sc.nextInt();
            int lastIndex = sc.nextInt();
            // swapping
            int tmp = arr[firstIndex];
            arr[firstIndex] = arr[lastIndex];
            arr[lastIndex] = tmp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
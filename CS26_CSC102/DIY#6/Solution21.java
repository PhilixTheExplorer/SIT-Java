import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Shift elements left by one position
        if (n > 0) {
            int firstElement = array[0];
            for (int i = 0; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            array[n - 1] = firstElement;
        }

        // Print the shifted array
        for (int val : array) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
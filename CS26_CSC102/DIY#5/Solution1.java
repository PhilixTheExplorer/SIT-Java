import java.util.Scanner;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int newDim = row * col; // Total number of elements in the matrix
        int[] mat = new int[newDim]; // Flattened matrix stored as a 1D array

        // Read matrix elements into the 1D array
        for (int i = 0; i < mat.length; i++) {
            mat[i] = sc.nextInt();
        }

        Arrays.sort(mat);

        int sum = 0;

        // Calculate the sum of all elements
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i];
        }

        // Calculate average
        double avg = (double) sum / mat.length;

        // Calculate median
        double median = 0;
        if (mat.length % 2 == 0) {
            // If even number of elements, average the two middle values
            median = (mat[mat.length / 2] + mat[mat.length / 2 - 1]) / 2.0;
        } else {
            // If odd, take the middle value
            median = mat[mat.length / 2];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Minimum value: " + mat[0]);
        System.out.println("Maximum value: " + mat[mat.length - 1]);
        System.out.println("Average value: " + avg);
        System.out.println("Median value: " + median);

        sc.close();
    }
}

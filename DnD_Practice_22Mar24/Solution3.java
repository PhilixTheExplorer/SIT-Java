import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        double[] numbers = new double[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextDouble();
        }

        Arrays.sort(numbers);

        if (size % 2 == 1) {
            swap(numbers, 0, size / 2 - 1);
            swap(numbers, size / 2 + 1, size - 1);
        } else {
            swap(numbers, 0, size / 2 - 1);
            swap(numbers, size / 2, size - 1);
        }

        for (double num : numbers) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

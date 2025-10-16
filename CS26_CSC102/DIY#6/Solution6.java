import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> commonElements = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                // Avoid duplicates in output
                if (commonElements.isEmpty() || commonElements.get(commonElements.size() - 1) != arr1[i]) {
                    commonElements.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        if (commonElements.isEmpty()) {
            System.out.println("No common elements");
        } else {
            for (int num : commonElements) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}

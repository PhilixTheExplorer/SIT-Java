import java.util.ArrayList;
import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        if (primes.size() < 2) {
            System.out.println("No prime pair was found.");
        } else {
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < primes.size(); i++) {
                for (int j = i + 1; j < primes.size(); j++) {
                    int distance = Math.abs(primes.get(i) - primes.get(j));
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            }
            System.out.println(minDistance);
        }
        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
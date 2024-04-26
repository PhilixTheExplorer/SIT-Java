import java.util.*;

public class Solution5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[20];
    for (int i = 0; i < 20; i++) {
      nums[i] = sc.nextInt();
    }

    ArrayList<Integer> primes = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      if (isPrime(nums[i])) {
        primes.add(nums[i]);
      }
    }
    int d = Integer.MAX_VALUE;
    int aSize = primes.size();
    for (int i = 0; i < aSize; i++) {
      for (int j = i + 1; j < aSize; j++) {
        int x = Math.abs(primes.get(i) - primes.get(j));
        d = Math.min(x, d);
      }
    }

    if (aSize == 0 || aSize == 1) {
      System.out.println("No prime pair found");
    } else {
      System.out.println(d);
    }
    sc.close();
  }

  private static boolean isPrime(int n) {
    if (n == 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}

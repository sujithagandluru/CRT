import java.util.Arrays;
import java.util.Scanner;

public class ChocoDistribution {
    public static int findMinDiff(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println("Minimum difference: " + findMinDiff(arr, n, m));
        sc.close();
    }
}

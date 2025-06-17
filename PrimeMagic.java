import java.util.*;

public class PrimeMagic {

    public static List<Integer> generatePrimes(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }

    public static int countPrimeMagic(int N) {
        List<Integer> primes = generatePrimes(N);
        
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < primes.size(); i++) {
            sum += primes.get(i);
            
            if (sum > N) break;
            if (sum >= 3 && primes.contains(sum)) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        System.out.println("Number of prime numbers satisfying the property: " + countPrimeMagic(N));
        
        sc.close();
    }
}

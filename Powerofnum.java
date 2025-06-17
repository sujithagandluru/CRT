
import java.util.Scanner;

public class Powerofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base = sc.nextDouble();
        int exponent = sc.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        sc.close();
    }
}


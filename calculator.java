import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Sum = " + (a + b));
        } else if (choice == 2) {
            System.out.println("Difference = " + (a - b));
        } else if (choice == 3) {
            System.out.println("Product = " + (a * b));
        } else if (choice == 4) {
            if (b != 0) {
                System.out.println("Quotient = " + (a / b));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

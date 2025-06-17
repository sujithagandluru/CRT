import java.util.Scanner;

public class IntToFloat {
    public static void main(String[] args) {
        handleConversion();
    }

    public static void handleConversion() {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        //System.out.print("Enter 1 to display int, or 2 to display float and sum: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Integer value: " + a);
            
        } else {
            System.out.print("Enter a float value: ");
            float b = sc.nextFloat();
            System.out.println("Float value: " + b);

            
        }
        float b=sc.nextFloat();
        float sum = a + b;
            System.out.println("Sum of int and float: " + sum);
    }
}

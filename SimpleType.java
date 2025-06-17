import java.util.Scanner;
public class SimpleType {
    public static void fun(float a, float b) {
        System.out.println("Result: " + (a + b));
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter choice (1 for integer addition, 2 for float addition):");
        int choice = sc.nextInt();
if (choice == 1) {System.out.println("Enter two integer values:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            fun(a, b);
        } else {
            System.out.println("Enter two float values:");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            fun(a, b);
        }
    }
}

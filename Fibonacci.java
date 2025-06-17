import java.util.*;
public class Fibonacci {
    public static void main(String argd[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter count: ");
        int count=s.nextInt();
        s.close();
        int a=0,b=1;
        System.out.println("The Fibonacci series is:");
        for(int i=0;i<count;i++){
            System.out.print(" "+a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
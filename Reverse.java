import java.util.*;
public class Reverse {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=s.nextInt();
        s.close();
        int rev=0;
        while(num>0)
        {
            rev=(rev*10)+(num%10);
            num=num/10;
        }
        System.out.println("reverse is: "+rev);
    }
}

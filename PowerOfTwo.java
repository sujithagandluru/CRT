import java.util.*;
public class PowerOfTwo {
    public static void main(String[] ar)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=s.nextInt();

        if((num>0) && ((num&( num-1))==0))
        {
            System.out.println(num+" is a power of 2");
        }
        else{
            System.out.println(num+" is not a power of 2");
        }
    }
}

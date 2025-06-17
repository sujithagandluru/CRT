import java.util.*;
public class PerfectNum {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter number:");
        int num=s.nextInt();
        int t=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                t+=i;
            }
        }
        if(t==num)
        {
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }
    }
}

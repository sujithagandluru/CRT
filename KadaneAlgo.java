import java.util.*;
public class KadaneAlgo
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=s.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

        int sum=arr[0];
        for(int i=0;i<size;i++)
        {
            int cs=0;
            for(int j=i;j<size;j++)
            {
                cs+=arr[j];
            }
            sum=Math.max(cs,sum);
        }

        System.out.println("Highest sum is: "+sum);
    }
}
import java.util.*;
public class MaxMin {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter size of array:");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Max: "+max+" Min: "+min);
    }
}

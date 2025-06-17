 import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int k=inp.nextInt();
        int[] ans=new int[n];
        int index=0;
        for(int i=k;i<n;i++){
            ans[index++]=arr[i];
        }

        for(int i=0;i<k;i++){
            ans[index++]=arr[i];
        }
        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}

import java.util.*;
public class SumOfArray{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        System.out.println("The sum of the elements in the array is "+Sum(arr,n));
    }
    public static int Sum(int arr[],int n){
            if(n==0)
                return 0;
            return arr[n-1]+Sum(arr,n-1);
    }
}
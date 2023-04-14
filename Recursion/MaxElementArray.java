import java.util.*;
public class MaxElementArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter 6 elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        System.out.println("Maximum element in the array is " + Max(arr, n));
    }
    public static int Max(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        else 
            return Math.max(arr[n-1], Max(arr, n-1));
    }
}
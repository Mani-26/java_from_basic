import java.util.Scanner;
public class SumOddEven{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                odd+=arr[i];
            else
                even+=arr[i];
        }
        System.out.println("The sum of the even numbers in the array is "+odd );
        System.out.println("The sum of the odd numbers in the array is "+even);
    }
}
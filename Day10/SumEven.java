import java.util.*;
public class SumEven{
public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (arr[i]%2==0){
                sum=sum + arr[i];
            }
        }
        System.out.println("The sum of the even numbers in the array is "+sum);
    }
}
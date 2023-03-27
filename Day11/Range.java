import java.util.*;
public class Range{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]>max){ 
            max=arr[i];
        }
            if (arr[i]<min){
                min=arr[i];
        }
        }            
        int range=max-min;
        System.out.println("The range of the array is "+range);       
    }
}
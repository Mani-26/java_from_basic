import java.util.*;
public class Mode{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int m=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        } 
        for (int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    m++;
                    System.out.println("The mode of the array is "+arr[i]);
                }
            }
        }
        if(m==0)
            System.out.println("The mode of the array is none");
    }
}
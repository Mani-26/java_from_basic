import java.util.*;
public class Deletion{
public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int pos=sc.nextInt();
        if (pos>n){
            System.out.println("Invalid Input");
       }
        else{
            System.out.println("Array after deletion is");
            int  a=0;
            while(a<n){
                if(a!=pos-1){
                System.out.println(arr[a]);
                }
                a++;
                }
      }
}
}
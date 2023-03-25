import java.util.*;
public class Insertion{
public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the location where you wish to insert an element");
        int pos=sc.nextInt();
        if (pos>n)
        {
            System.out.println("Invalid Input");
        }
        else
        {   
            System.out.println("Enter the value to insert");
            int ele=sc.nextInt();        
            System.out.println("Array after insertion is");
            for(int i=0;i<n;i++){
                if (i==pos-1){
                    System.out.printf("%d\n%d\n",ele,arr[i]);
                }
                else{
                    System.out.printf("%d\n", arr[i]);
                }
            }
        }
    }
}
import java.util.*;
public class Median{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the  elements in the array");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        if(n%2==0){
            System.out.printf("The median of the array is %.2f"+" ",(float)(a[n/2]+a[(n/2)+1])/2);
        }else{
              System.out.printf("The median of the array is %.2f"+" ",(float)(a[(n+1)/2]));
        }
}
}
import java.util.Scanner;
public class Mean{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        float sum=0;
        float avg=0;
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            avg=sum/n;
        }
        System.out.printf("The mean of the array is "+"%.2f",avg);
}
}
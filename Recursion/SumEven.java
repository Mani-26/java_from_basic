import java.util.Scanner;
public class SumEven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The sum of the even elements in the array is "+sum(a,n-1));
    }
    static int sum=0;
    public static int sum(int a[],int x){
        if(x<0)
            return sum;
        if(a[x]%2==0)
            sum+=(a[x]);
            return sum(a,x-1);
    }
}
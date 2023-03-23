import java.util.*;
public class Distinct2{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int b=0;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                if(arr[i]==arr[j] && (i>j))
                    b=1;  
            }
            if(b==0)
                a++;
        }
        System.out.printf("%d",a);
    }
}
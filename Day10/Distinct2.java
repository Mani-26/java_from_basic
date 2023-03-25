import java.util.*;
public class Distinct2{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int b=0;
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(arr[i]==arr[j] && (i>j))
                    b=1;  
            }
            if(b==0)
                a++;
            }               /*3 2 3 780 90 
                              3 2 3 780 90
    iter1 b=0,a=1, iter2 b=0,a=2, iter3 b=1 a=2, iter4 b=0 a=3, iter5 b=0 a=4*/
        System.out.printf("%d",a);
    }
}
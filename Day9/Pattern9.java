import java.util.*;
public class Pattern9{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=1;
    int d=n*n+1;
    for(int i=n;i>=1;i--){
        for(int k=0;k<n-i;k++){ //for space
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){ //for forward
            System.out.print("%d*",a++);
        }
        for(int t=i;t>1;t--){ //for reverse
            System.out.printf("%d*",d++);
        }
        System.out.print(d);
        System.out.print("\n");
        d=d-2*(i-1);
    }
}   
}
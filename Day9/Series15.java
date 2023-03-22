import java.util.*;
public class Series15{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=3,b=8,c;
            System.out.print(a+" "+b+" ");
        for(int i=2;i<=n+1;i++){
            c=(a+b)+i;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
}
}
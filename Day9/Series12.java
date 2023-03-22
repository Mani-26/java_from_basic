import java.util.*;
public class Series12{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=9,b=11,c=a+b,i;
            System.out.print(a+" ");
            System.out.print(b+" ");
        for(i=3;i<=n;i++){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;  
        }
}
}
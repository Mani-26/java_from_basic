import java.util.*;
public class Series14{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=2;
        double b=1.5;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            b*=2;
            a+=b;
        }
}
}
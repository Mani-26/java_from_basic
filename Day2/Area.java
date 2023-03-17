import java.util.*;
public class Area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        float r=sc.nextFloat();
        int sq=a*a;
        int rc=l*b;
        double cr=(3.14*r*r);
        System.out.println(sq);
        System.out.println(rc);
        System.out.printf("%.2f",cr);
    }
}
import java.util.*;
public class Poly2{
    static int a,b;
    static double c,d;
    static void multiply(int num1,int num2){
        int m=num1*num2;
        System.out.println(m);
    }
    static void multiply(double num1,double num2){
        double m=num1*num2;
        System.out.println(m);
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double c=s.nextDouble();
        double d=s.nextDouble();
        multiply(a,b);
        multiply(c,d);
    }
}
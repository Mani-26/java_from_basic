import java.util.*;
public class DivideMultiply{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("  Mul = " + (a*b)+"  Div = " + (a/b) +  "  Rem = " + (a%b));
    }
}
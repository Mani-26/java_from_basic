import java.util.*;
public class Swap2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A = " +a+ "\n" +"B = "+b);
    }
}
import java.util.*;
public class Base{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the base to which you want to convert");
        int a=sc.nextInt();
        System.out.println("The number in base "+a+" is "+base(n,a));
        sc.close();
    }
    public static String base(int n,int a){
        if(n==0)
            return "";
        else
            return base(n/a,a)+n%a;
    } 
}
import java.util.*;
public class Fibo{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("The term "+n+ " in the fibonocci series is "+fibo(n));}
    public static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
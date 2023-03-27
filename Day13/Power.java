import java.util.*;
public class Power{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("The value of " + a +" power " +n +" is "+pow(a,n));}
public static int pow(int a,int n){
        if(n==0){
            return 1;}
        else{
            return a*pow(a,n-1);
        }
    }
}
import java.util.*;
public class Sum{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("The sum of digits in "+n+" is "+sum(n));}
public static int sum(int n){
    if(n==0)
        return 0;
    else
        return (n % 10 + sum(n / 10));  
}      
}
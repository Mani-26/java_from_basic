import java.util.Scanner;
public class Fact{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("The factorial of "+n+ " is "+fact(n));
    }
public static int fact(int n){
    if(n!=0){
        return n*fact(n-1);
    }
    else{
        return 1;
    }
    }    
}
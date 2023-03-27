import java.util.Scanner;
public class NoOfDigit{
public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("The number of digits in "+n+" is "+b(n));
}
public  static int b(int n){
    if (n%10==0 && n<10)
        return 0;       
    if(n%10==0)
        return 0+ b (n / 10);
        return 1+ b(n/10);
    }
}
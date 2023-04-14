// take one float input from the user and print that value in two decimal places
import java.util.*;
public class ArithOperation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.printf("a+b = "+ (a+b)+" a-b = "+ (a-b)+" a*b = "+ (a*b)+" a/b = "+ (a/b)+" a mod b = "+ (a%b) );
    }
}
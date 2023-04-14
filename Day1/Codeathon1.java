// take one float input from the user and print that value in two decimal places
import java.util.*;
public class Codeathon1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        sc.close();
        System.out.printf("%.2f",a);
    }
}
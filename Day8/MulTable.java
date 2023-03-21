import java.util.*;
public class MulTable{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
        System.out.println("Enter n");
    int n = sc.nextInt();
        System.out.println("Enter m");
    int m = sc.nextInt();
        System.out.println("The multiplication table of "+n+" is");
    int i=1;
        while(i<=m){
            System.out.println(i+"*"+n+"="+(i*n));
            i++;
        }
    }
}
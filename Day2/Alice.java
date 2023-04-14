import java.util.*;
public class Alice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bird=sc.nextInt();
        sc.close();
        int a=(bird / 10);
        int b=(bird % 10);
        System.out.println("Alice must go in path-"+(a+b));
    }
}
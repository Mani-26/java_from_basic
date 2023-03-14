import java.util.*;
public class OddEven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String k=(a%2==0)?"Even":"Odd";
        System.out.println(k);
    }
}
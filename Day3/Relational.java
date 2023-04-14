import java.util.*;
public class Relational{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if(a==b){
            System.out.println(a+" and "+b+" are equal");
        }
        else{
        String c=(a+" greater than "+b);
        String d=(a+" less than "+b);
        String k=(a>b)?c:d;
        System.out.println(k);
        }
    }
    }

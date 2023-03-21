import java.util.*;
public class Trendy{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int inp=sc.nextInt();
    if(inp>99 && inp<=999){
        int a=inp/10;
        int b=a%10;
        if(b%3==0){
            System.out.println("Trendy Number");
        }
        else{
            System.out.println("Not a Trendy Number");
        }
    }
    else{
        System.out.println("Not a Trendy Number");
    }
}
}
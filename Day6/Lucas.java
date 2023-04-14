import java.util.*;
public class Lucas{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int inp=sc.nextInt();
    sc.close();
    int a=0,b=0,c=1,d=a+b+c;
    System.out.print(a+" "+b+" "+c);
    while(inp>3){
        d=a+b+c;
        System.out.print(" "+ d);
        inp--;
        a=b;
        b=c;
        c=d;
    }
}
}
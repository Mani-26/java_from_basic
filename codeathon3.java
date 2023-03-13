//
import java.util.*;
public class Codeathon3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//total coins
        int b=sc.nextInt();//blackbear share %
        int c=sc.nextInt();//longben share %
        int d=(a*b)/100;//blackbear share coins
        int e=((a-d)*c/100);//longben share coins
        int f=((a-d-e)/3);
        System.out.println("Total coins :"+a);
        System.out.println("BlackBear's share :"+d);
        System.out.println("LongBen's share :"+e);
        System.out.println("Single pirate's share :"+f);
    }
}
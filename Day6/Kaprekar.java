import java.util.*;
public class Kaprekar{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int inp = sc.nextInt();
    int sq,p,sum=0,digit=0,k;
    sq = inp*inp;
    p = inp*inp;
        while(sq>0){
            digit++;
            sq = sq/10;
        }
        if(digit%2==0){
        k =(int)Math.pow(10,((digit/2)));
        }
        else{
            k =(int)Math.pow(10,((digit/2)+1));
        }
        if(p>0){
            sum = sum+(p%k);
            sum = sum+(p/k);
        }
        if(sum==inp){
            System.out.println("Kaprekar Number");
        }
        else{
            System.out.println("Not a Kaprekar Number");
        }
    }
}
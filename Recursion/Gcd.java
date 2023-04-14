import java.util.*;
public class Gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two positive integers");
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        System.out.println("G.C.D of "+n+" and "+m+" = "+gcd(n,m));
        }
        public static int gcd(int n,int m){
        if(n%m==0)
            return m;
        else{
            int s=n%m;
            return gcd (m,s);
        }
    }
}
import java.util.*;
public class SpecialNum{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int p=m,first=0,last=0,sum=0,pro=0;
    if(m>9 && m<=99 && n>9 && n<=99){
        while(p >= m && p <= n){
            first=p/10;
            last=p%10;
            sum = first+last;
            pro = first*last;
            if ((sum+pro)==p){
                System.out.println(p);
            }
            p++;
        }
    }       
    }
}
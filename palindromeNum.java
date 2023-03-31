import java.util.*;
public palindromeNum{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=0;
        while(a>b){
            b=b*10+a%10;
            a/=10;
        }
        if(a==b || a==b/10)
            System.out.println("Palindrome Number");
        else 
            System.out.println("Not a Palindrome Number");
    }
}
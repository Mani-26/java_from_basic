import java.util.Scanner;
public class Factorial{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int a=1,fact=1;
    while(fact<num){
        a+=1;
        fact*=a;
    }   
    if(fact==num){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
}
}
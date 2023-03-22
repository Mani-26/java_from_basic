import java.util.*;
public class Pattern9{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=1,b=n*2;
    for(int i=n;i>=1;i--){
        for(int k=0;k<n-i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(a++ +"*");

        }
        System.out.print("\n");
    }
}   
}
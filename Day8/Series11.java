import java.util.Scanner;
public class Series11{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=95,b=18.5;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            b+=2;
            a+=b;
        }
}
}
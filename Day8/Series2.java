import java.util.Scanner;
public class Series2{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=6;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=(5*i);
        }
}
}
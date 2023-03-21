import java.util.Scanner;
public class Series3{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=3;
        System.out.print(a);
        for(int i=2;i<=n;i++){
            a=(int)Math.pow(3,i);
            System.out.print(" "+a);
        }
}
}
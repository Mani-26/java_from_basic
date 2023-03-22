import java.util.Scanner;
public class Series8{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=4;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=(i*i);
        }
    }
}
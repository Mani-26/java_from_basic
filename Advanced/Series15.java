import java.util.Scanner;
public class Series15{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int a=4;
        System.out.print(a);
        for(int i=1;i<n;i++){
            a+=(i*i);
            System.out.print(" "+a);
        }
    }
}
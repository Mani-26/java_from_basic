import java.util.Scanner;
public class Series1{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,a=0;
        for(i=1;i<=n;i++){
            a=i*i;
            System.out.println(a);
        }
}
}
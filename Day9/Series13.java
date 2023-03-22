import java.util.Scanner;
public class Series13{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=5,b=-11;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            b+=22;
            a+=b;
        }
}
}
import java.util.Scanner;
public class Series4{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float a=0.5;
        System.out.print(a);
        for(i=1;i<n;i++){
            a+=(5*i);
            System.out.print(" "+a);
        }
}
}
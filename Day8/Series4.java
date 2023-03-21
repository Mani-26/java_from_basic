import java.util.Scanner;
public class Series4{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float a=0.5f;
            System.out.printf("%.1f",a);
        for(int i=1;i<n;i++){
            a+=(2*a);
            System.out.printf(" "+"%.1f",a);
        }
}
}
import java.util.*;
public class SI{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        float r=sc.nextFloat();
        float interest=p*n*r/100;
        System.out.printf("%.2f",interest);
    }
}
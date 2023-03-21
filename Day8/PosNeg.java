import java.util.Scanner;
public class PosNeg{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int count=0,a=0,i;
        for(i=1;i<=n;i++){
            int b=sc.nextInt();
            if(b>=0){
                a+=b;
                count++;
            }
        }
        System.out.println("Number of positive numbers entered is "+count+" and the sum is "+a);

}
}
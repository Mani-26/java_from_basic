import java.util.Scanner;
public class Valid{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int inp=sc.nextInt();
        while(inp%8==0 && inp>0){
        inp=sc.nextInt();
            count++;
        }
        System.out.println("The number of valid numbers entered is "+count);
    }
}
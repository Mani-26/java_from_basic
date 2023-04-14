import java.util.*;
public class Profit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.close();
            int profit=((a-b)*x-100);
            System.out.println("The profit obtained is Rs."+profit);
    }
}
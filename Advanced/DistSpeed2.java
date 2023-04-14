import java.util.*;
public class DistSpeed2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int d = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        sc.close();
        if (d >0&&t>0&&s>0){
        if(s*t >=d)
            System.out.println("Yes");
        else
            System.out.println("No");
        }
        else
            System.out.println("Invalid Input");
    }
}
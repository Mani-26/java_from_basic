import java.util.*;
public class FencingGround{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Required length is "+(2*(l+b))+"m"+"\n"+"Required quantity of carpet is "+(l*b)+"sqm");
    }
}
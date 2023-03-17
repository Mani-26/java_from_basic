import java.util.*;
public class Mango2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int t=sc.nextInt();
        if((t >= 1 && t <= r) || (t % r ==1) || (t > (r*c)-r && (t <= (r*c)))){
                System.out.println("YES");
        }
        else{
                System.out.println("NO");
        }
    }
}
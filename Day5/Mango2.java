import java.util.*;
public class Mango1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rn=sc.nextInt();
        int cn=sc.nextInt();
        int tn=sc.nextInt();
        if((tn >= 1 && tn <= rn) || (tn % rn ==1) || (tn )){
                System.out.println("YES");
        }
        else{
                System.out.println("NO");
        }
    }
}
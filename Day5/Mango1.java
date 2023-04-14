import java.util.*;
public class Mango1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rn=sc.nextInt();
        int cn=sc.nextInt();
        int tn=sc.nextInt();
        sc.close();
        if((tn >= 1 && tn <= cn) || (tn % rn ==1) || (tn % cn ==0)){
                System.out.println("YES");
        }
        else{
                System.out.println("NO");
        }
    }
}
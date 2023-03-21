import java.util.*;
public class DataMine{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int inp = sc.nextInt();
    int sq,p,digit=0,a=0,odd=0,even=0;
    p = inp;
        while(p>0){
            a=p%10;
            if(a%2==0){
                even+=a;
            }
            else{
                odd+=a;
            }
            p = p/10;
        }
        if(odd==even){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
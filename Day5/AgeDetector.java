import java.util.*;
public class AgeDetector{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        if(a>b){
             c=b+100-a;
        }
        else{
             c=b-a;
        }
        System.out.println(c);
    }
}
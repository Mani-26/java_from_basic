import java.util.*;
public class Prime{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
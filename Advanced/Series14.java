import java.util.*;
public class Series14{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        float a=1;
            System.out.print((int)a+" ");
        for (int i=1;i<n;i++){
            if(i%2==1){
                a*=2.0f;
                System.out.print(a+" ");
            }
            else{
                a*=1.5f;
                System.out.print(a+" ");  
            } 
        }
    }
}
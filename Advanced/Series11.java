import java.util.*;
public class Series11{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        float a=0.5f;
        for (int i=0;i<n;i++){
            System.out.print(a+" ");
            a=a*3;
        }
    }
}
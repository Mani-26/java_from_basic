import java.util.*;
public class Series12{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int a=11;
        for (int i=0;i<n;i++){
            System.out.print(a*a+" ");
            a+=4;;
        }
    }
}
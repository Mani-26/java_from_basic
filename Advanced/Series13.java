import java.util.*;
public class Series13{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i=1;i<=n;i++){
            if(i%2==1){
                System.out.print((i*i-1));
                if(i+1<=n)
                    System.out.print(" ");
                }
            else{
                System.out.print((i*i-2));
                if(i+1<=n)
                    System.out.print(" ");
                }
        }
    }
}
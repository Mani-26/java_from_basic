import java.util.*;
public class Pattern10{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<n;j++){
            System.out.print(i);
            if(j==n-1){
                System.out.print(i+1);
            }
        }
        System.out.print("\n");
    }
}   
}
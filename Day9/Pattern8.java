import java.util.*;
public class Pattern8{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if((j+i)==6 || (j+m)==6){
            System.out.print("*"+" ");
            }
            else{
                System.out.print(" "+" ");
            }
        }m--;
        System.out.print("\n");
    }
}
}
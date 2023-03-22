import java.util.*;
public class Pattern3{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    n=n*2;
    for(int i=1;i<n;i+=2){
        for(int j=i;j<n;j+=2){
            System.out.print(j+" ");
        }
        System.out.print("\n");
    }
}   
}
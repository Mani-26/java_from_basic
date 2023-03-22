import java.util.*;
public class Pattern2{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(c%2==0){
            System.out.print(1+" ");
            }
            else{
                System.out.print(0+" ");
            }
            c++;
        }
        System.out.print("\n");
    }
}   
}
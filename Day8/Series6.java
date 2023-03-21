import java.util.Scanner;
public class Series6{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq,iter=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sq = (int)Math.pow(i,2);
                sq-=1;
                System.out.print(sq+" ");
            }
            else{
                sq = (int)Math.pow(i,2);
                sq-=2;
                System.out.print(sq+" ");
            }
        }
}
}
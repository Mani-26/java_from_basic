import java.util.Scanner;
public class Series5{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=11,count=0,sq;
        while(count!=n){
            sq = a*a;
            a+=4;
            count++;
            System.out.print(sq+" ");
        }
        // for(int i=1;i<n;i++){
        //     a=(int)Math.pow(3,i);
        //     System.out.print(" "+a);
        // }
}
}
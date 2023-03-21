import java.util.Scanner;
public class Series7{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        float b=2,c=3;
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.print(a+" ");
            }
            else if(i%2==0){
                System.out.print(b+" ");
                b*=3;
            }
            else{
                System.out.print(c+" ");
                c*=3;
            }
        }
}
}
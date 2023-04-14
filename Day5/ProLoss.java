import java.util.Scanner;
public class ProLoss{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        sc.close();
        float c=(y*12);
        float d=(x-c);
        float e=(c-x);
        if(x>c){
            System.out.printf("Loss : Rs."+"%.2f",d);
        }
        else if(x<c){
        System.out.printf("Profit : Rs."+"%.2f",e);
        }
        else {
            System.out.println("no profit nor Loss");
        }
    }
}
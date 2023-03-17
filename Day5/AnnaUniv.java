import java.util.Scanner;
public class AnnaUniv{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a==100){
            System.out.println("S");
        }
        else if(a>=90&&a<=99){
            System.out.println("A");
        }
        else if(a>=80&&a<=89){
            System.out.println("B");
        }
        else if(a>=70&&a<=79){
            System.out.println("C");
        }
        else if(a>=60&&a<=69){
            System.out.println("D");
        }
        else if(a>=50&&a<=59){
            System.out.println("E");
        }
        else if(a<50){
            System.out.println("F");
        }
         else{
             System.out.println("Invalid Input");
        }
    }
}
import java.util.*;
public class Budget{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double Blast_Rifle=350.34;
        double Visual_Sensors=230.90;
        double Auditory_Sensors=190.55;
        double Arms=125.30;
        double Legs=180.90;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        double budget=((a*Blast_Rifle)+(b*Visual_Sensors)+(c*Auditory_Sensors)+(d*Arms)+(e*Legs));
        if(budget<=15000){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
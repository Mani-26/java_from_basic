import java.util.*;
public class extra2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
            float item1=sc.nextFloat();
            float item2=sc.nextFloat();
            int dispt=sc.nextInt();
            sc.close();
            float total=(item1+item2);
            float temp=total*dispt/100;
            float disam=total-temp;
            float ams=total-disam;
            System.out.println("TotalPrice="+total+"\n"+"DiscountedPrice="+disam+"\n"+"Amountsaved="+ams);
            }
}
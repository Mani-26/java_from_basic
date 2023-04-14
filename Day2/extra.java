import java.util.*;
public class extra{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
            int input=sc.nextInt();
            sc.close();
            int year=input/365;
            int rem1=input%365;
            int week=rem1/7;
            int days=rem1%7;
            System.out.println("Years="+year+"\n"+"Weeks="+week+"\n"+"Days="+days);
            }
}
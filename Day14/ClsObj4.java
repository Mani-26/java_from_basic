import java.util.*;
public class ClsObj4 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Innings pl=new Innings();
        pl.Innings=sc.nextLine();
        pl.team=sc.nextLine();
        pl.run=sc.nextLong();
        pl.displayInningsDetails();
    }
}
class Innings{
    static String Innings ;
    static String team;
    static long run;
    public static void displayInningsDetails(){
        System.out.println("Innings Details");
        System.out.println("Innings number: "+ Innings);
        System.out.println("Batting Team : "+ team);
        System.out.println("Runs scored :"+run);
    }
}
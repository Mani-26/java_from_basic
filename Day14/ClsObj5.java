import java.util.*;
public class ClsObj5{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String team1=sc.nextLine();
        long run1=sc.nextLong();
        String team2=sc.next();
        long run2=sc.nextLong();
        Innings inn1=new Innings(team1,run1);
        Innings inn2=new Innings(team2,run2);
        System.out.println("Innings 1 Details");
        System.out.println("BattingTeam :"+" "+inn1.team);
        System.out.println("Runs scored :"+" "+inn1.runs);
        System.out.println("Innings 2 Details");
        System.out.println("BattingTeam: "+" "+inn2.team);
        System.out.println("Runs scored :"+" "+inn2.runs);
    }
}
class Innings{
    String team;
    long runs;
    Innings(String a,long b){
        team=a;
        runs=b;
    }
}
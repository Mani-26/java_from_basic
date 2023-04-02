import java.util.*;
public class ClsObj2{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Player pl=new Player();
        pl.name=sc.nextLine();
        pl.country=sc.nextLine();
        pl.skill=sc.nextLine();
        System.out.println("Player Details");
        System.out.println("Player Name: "+ pl.name);
        System.out.println("Country Name: "+ pl.country);
        System.out.println("Skill : "+pl.skill);
    }
}
class Player{
   String name;
   String country;
   String skill;
}
import java.util.*;
public class ClsObj3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Player pl=new Player();
        pl.str=sc.nextLine();
        String arr[]=pl.str.split(",");
        System.out.println("Player Details");
        System.out.println("Player Name: "+ arr[0]);
        System.out.println("Country Name: "+ arr[1]);
        System.out.println("Skill : "+arr[2]);
    }
}
class Player{
   String str;
}
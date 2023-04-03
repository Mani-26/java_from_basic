import java.util.*;
public class encapsulation4{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Player p=new Player();
        p.setname(s.next());
        p.setage(s.nextInt());
        p.settype(s.next());
        System.out.println("Player's Name: "+p.getname());
        System.out.println("Player's Age: "+p.getage());
        System.out.println("Player's Gametype: "+p.gettype());
    }
}
class Player{
    private String pName; 
    private int pAge; 
    private String gameType; 
        public void setname(String name){
            pName=name;
        }
        public String getname(){
            return pName;
        }
        public void setage(int age){
            pAge=age;
        }
        public int getage(){
            return pAge;
        }
        public void settype(String type){
            gameType=type;
        }
        public String gettype(){
            return gameType;
        }
    }
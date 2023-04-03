import java.util.*;
public class encapsulation5{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Hall h=new Hall();
        h.setname(s.next());
        h.set(s.nextInt());
        h.settype(s.next());
        System.out.println("Player's Name: "+h.getname());
        System.out.println("Player's Age: "+h.getage());
        System.out.println("Player's Gametype: "+h.gettype());
    }
}
class Hall{
    private String name; 
    private String contactNumber; 
    private double costPerDay;
    private String ownerName; 
        public void setname(String name){
            this.name=name;
        }
        public String getname(){
            return name;
        }
        public void setcontactNumber(String contactNumber){
            this.contactNumber=contactNumber;
        }
        public String getcontactNumber(){
            return contactNumber;
        }
        public void setcostPerDay(double costPerDay){
            this.costPerDay=costPerDay;
        }
        public double getcost(){
            return gameType;
        }
    }
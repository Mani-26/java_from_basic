import java.util.*;
public class encapsulation5{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Hall h1=new Hall();
        Hall h2=new Hall();
        h1.setname(s.nextLine());
        h1.setcontactNumber(s.nextLine());
        h1.setcostPerDay(s.nextDouble());
        s.nextLine();
        h1.setownerName(s.nextLine());
        h2.setname(s.nextLine());
        h2.setcontactNumber(s.nextLine());
        h2.setcostPerDay(s.nextDouble());
        s.nextLine();
        h2.setownerName(s.nextLine()); 
        if(h1.getname().equals(h2.getname()) && h1.getcontactNumber().equals(h2.getcontactNumber()) && h1.getcostPerday()==(h2.getcostPerday()) && h1.getownerName().equals(h2.getownerName())) {
            System.out.println("Halls are same");
        }     
        else
            System.out.println("Halls are different");
    }
}
class Hall{
    private String name; 
    private String contactNumber; 
    private double costPerDay;
    private String ownerName; 
        void setname(String name){
            this.name=name;
        }
        String getname(){
            return name;
        }
        void setcontactNumber(String contactNumber){
            this.contactNumber=contactNumber;
        }
        String getcontactNumber(){
            return contactNumber;
        }
        void setcostPerDay(double costPerDay){
            this.costPerDay=costPerDay;
        }
        double getcostPerday(){
            return costPerDay;
        }
        void setownerName(String ownerName){
            this.ownerName=ownerName;
        }
        String getownerName(){
            return ownerName;
        }
    }
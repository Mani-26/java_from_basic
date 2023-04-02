import java.util.*;
public class practice4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String city=sc.nextLine();
        Venue v=new Venue(name,city);
        v.display();
    }
}
class Venue{
    String name;
    String city;
    Venue(String n,String c){
        name=n;
        city=c;
    }
    void display(){
        System.out.println("Venue Details");
        System.out.println("Venue Name: "+name);
        System.out.println("City Name: "+city);
    }
    
}
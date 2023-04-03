import java.util.*;
public class practice4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Venue v=new Venue(str);
        v.display();
    }
}
class Venue{
    String name;
    String city;
    String str;
    Venue(String str){
        this.str=str;
        String arr[]=str.split(",");
        name=arr[0];
        city=arr[1];
    }
    void display(){
        System.out.println("Venue Details");
        System.out.println("Venue Name: "+name);
        System.out.println("City Name: "+city);
    }
    
}
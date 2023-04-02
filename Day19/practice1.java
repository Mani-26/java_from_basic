import java.util.*;
public class practice1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String countrycode=sc.nextLine();
        String isdcode=sc.nextLine();
        CountryMain cm=new CountryMain();
        cm.setname(name);
        cm.setcountrycode(countrycode);
        cm.setisdcode(isdcode);
        System.out.println("Country Name :"+" "+cm.getname());
        System.out.println("Country Code :"+" "+cm.getcountrycode());
        System.out.println("ISD Code :"+" "+cm.getisdcode());
    }
}
class Country{
    String name;
    String countrycode;
    String isdcode;
}
class CountryMain extends Country{
    void setname(String name){
        this.name=name;
    }
    void setcountrycode(String countrycode){
        this.countrycode=countrycode;
    }
    void setisdcode(String isdcode){
        this.isdcode=isdcode;
    }
    String getname(){
        return name;
    }
    String getcountrycode(){
        return countrycode;
    }
    String getisdcode(){
        return isdcode;
    }   
}
/*************class=placement(grand paren),core(parent),child(it)
            (gp)1method=name,(p)2method=lnt,philips,(c)2method=cts,tcs
            (gp)name=string input get & print
            (p)int emark print
            (c)int pkg print
        with main cls(multilevel)********************/
import java.util.*;
public class ques1{
    public static void main(String []args){
        it s=new it();
        Scanner sc=new Scanner(System.in);
        String nam=sc.next();
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int pkg1=sc.nextInt();
        int pkg2=sc.nextInt();
        s.setname(nam);
        s.setLNT(mark1);
        s.setPHILIPS(mark2);
        s.setCTS(pkg1);
        s.setTCS(pkg2);
        System.out.println("Name: "+s.getname());
        System.out.println("Eligibility Mark LNT: "+s.getLNT());
        System.out.println("Eligibility Mark PHILIPS: "+s.getPHILIPS());
        System.out.println("Package CTS: "+s.getCTS());
        System.out.println("Package TCS: "+s.getCTS());
    }
}
class placement{
    String name;
    void setname(String nam){
        name =nam;
    }
    String getname(){
        return name;
    }
}
class core extends placement{
    int mark1,mark2;
    void setLNT(int mark1){
        this.mark1= mark1;
    }
    int getLNT(){
        return mark1;
    }
    void setPHILIPS(int mark2){
        this.mark2= mark2;
    }
    int getPHILIPS(){
        return mark2;
    }
}
class it extends core{
    int pkg1,pkg2;
    void setCTS(int pkg1){
        this.pkg1=pkg1;
    }
    int getCTS(){
        return pkg1;
    }
    void setTCS(int pkg2){
        this.pkg2=pkg2;
    }
    int getTCS(){
        return pkg2;
    }
}
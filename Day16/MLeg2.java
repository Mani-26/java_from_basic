import java.util.*;
public class Multilevel{
public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    String jasmin=scan.nextLine();
    String ros=scan.nextLine();
    jasmine jas=new jasmine();
    jas.color();
    jas.color1(ros);
    jas.color2(jasmin);
}
}
class flower{
    void color(){
        System.out.println("Based on Flower");
    }
}
class rose extends flower{
    String col1;
    void color1(String ros){
        col1=ros;
        System.out.println("Color of rose: "+col1);
    }
}
class jasmine extends rose{
    String col2;
    void color2(String jasmin){
        col2=jasmin;
        System.out.println("Color of Jasmine: "+col2);
    }
}
import java.util.*;
public class Multilevel{
public static void main(String []args){
    jasmine jas=new jasmine();
    jas.color();
    jas.color1();
    jas.color2();
}
}
class flower{
    void color(){
        System.out.println("Based on Flower");
    }
}
class rose extends flower{
    void color1(){
        System.out.println("Color of rose: Rose");
    }
}
class jasmine extends rose{
    void color2(){
        System.out.println("Color of Jasmine: White");
    }
}
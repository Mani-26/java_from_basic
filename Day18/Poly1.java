import java.util.*;
public class Poly1{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Hello h=new Hello();
        h.sayHello();
        h.sayHello(str);
        String str2=h.sayHello(str);
        System.out.println(str2);
    }
}
class Hello{
    public void sayHello(){
        System.out.println("Hello");
    }
    public String sayHello(String str){
        String str1="Hello "+str;
        return str1;
    }
}
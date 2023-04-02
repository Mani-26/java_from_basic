import java.util.*;
public class Poly4{
    public static void main(String []args){
        main("Hi");
        main("Overloaded: "+"Hello World");
        main();
    }
    static void main(String s){
        System.out.println(s);
    }
    static void main(String s1, String s2){
        System.out.println(s1 + s2);
    }
    static void main(){
        System.out.println("Overloaded: Tom & Jerry");
    }
}
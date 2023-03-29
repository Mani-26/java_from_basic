import java.util.*;
public class Single{
    public static void main(String[]args){
        Animal2 k=new Animal2();
        k.King();
        k.NextKing();
    }
}
class Animal1{
    public static void King(){
        System.out.println("Lion Is King");
    }
}
class Animal2 extends Animal1{
    public static void NextKing(){
        System.out.println("Tiger Is NextKing");
    }
}
import java.util.*;
public class Inherit4{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Kiwi k=new Kiwi();
        k.Birds();
        if(str.equalsIgnoreCase("Parrot"))
            k.Parrot();
        else if(str.equalsIgnoreCase("Cocktail"))
            k.Cocktail();
        else if(str.equalsIgnoreCase("Kiwi"))
            k.Kiwi();
    }
}
class Birds{
    void Birds(){
    System.out.print("Birds : ");
    }
}
class Parrot extends Birds{
    void Parrot(){
        System.out.println("Grey Parrot.");
    }
}
class Cocktail extends Parrot{
    void Cocktail(){
        System.out.println("Grey Cocktail");
    }
}
class Kiwi extends Cocktail{
    void Kiwi(){
        System.out.println("Grey Kiwi.");
    }
}
import java.util.*;
public class Color{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String color = sc.nextLine();
        if (color.equals("BLUE"))
            System.out.println("It is Dawn");
        else if (color.equals("RED"))
            System.out.println("It is Dusk");
        else if (color!="BLUE"&& color !="RED")
            System.out.println("Invalid Input");
    }
}
import java.util.*;
public class weather{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String weather = sc.nextLine();
        sc.close();
        if (weather.equals("sunny"))
            System.out.println("Yes I can drive :)");
        else if (weather.equals("foggy") || weather.equals("rainy"))
            System.out.println("No I cant drive :(");
        else 
            System.out.println("Sorry invalid input :|");
    }
}
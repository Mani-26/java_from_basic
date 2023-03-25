import java.util.*;
public class Compare{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        if(str.equals(str1))
            System.out.print("Strings are same");
        else
            System.out.print("Strings are not same");
}
}
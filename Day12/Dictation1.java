import java.util.*;
public class Dictation1{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        if(str.equals(str1))
            System.out.print("It is correct");
        else
            System.out.print("It is not correct");
}
}
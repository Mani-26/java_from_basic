import java.util.*;
public class Palindrome{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        int n=str.length(); 
        for(int i=n-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");
}
}
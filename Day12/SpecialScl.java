import java.util.*;
public class SpecialScl{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        String rev="";
        int n=str1.length(); 
        for(int i=n-1;i>=0;i--){
            rev+=str1.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
            System.out.print("It is correct");
        else
            System.out.print("It is wrong");
}
}
import java.util.*;
public class Reverse{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print("The reversed String is ");
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            System.out.print( str.charAt(i));
        }
}
}
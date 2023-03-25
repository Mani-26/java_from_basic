import java.util.*;
public class StringLength{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int a=0;
        for(char c:ch){
            a++;
        }
            System.out.print(a);
}
}
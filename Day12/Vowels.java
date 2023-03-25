import java.util.*;
public class Vowels{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
                c++;
        }
            System.out.print("Number of vowels: "+c);
}
}
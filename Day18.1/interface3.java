import java.util.*;
public class Interface3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        main m=new main();
        m.print(str,n);
    }
}
interface Case{
    public void print(String str,int n);
}
class main implements Case{
    public int n;
    public String str;
    public void print(String str,int n){
        this.n=n;
        this.str=str;
        for(int i=0;i<n;i++){
            char b=str.charAt(i);
            if(Character.isLowerCase(b))
                System.out.print(b);
        }
        for(int i=0;i<n;i++){
            char b=str.charAt(i);
            if(Character.isUpperCase(b))
                System.out.print(b);
        }
    }
}
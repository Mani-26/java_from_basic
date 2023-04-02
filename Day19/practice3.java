import java.util.*;
public class practice3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char c=s.next().charAt(0);
        find o=new find(str,c);
    }
}
class find{
    public String str;
    public char c;
    public int n,count=0;
    find(String str, char c){
        this.str=str;
        this.c=c;
        n=str.length();
        for(int i=0;i<n;i++){
            char b=str.charAt(i);
            if(b==c)
                count++;
        }
    System.out.println(count);
    }
}
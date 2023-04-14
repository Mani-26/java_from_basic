import java.util.*;
public class AsciiForChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        sc.close();
        System.out.printf("ASCII ="+(int)a);
    }
}
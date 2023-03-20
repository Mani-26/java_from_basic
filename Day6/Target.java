import java.util.*;
public class Target{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int score = sc.nextInt();
    int a,count=1;
    int mark = sc.nextInt();
    a=mark;
    while(a<score){
        count++;
        mark = sc.nextInt();
        a = a + mark;
    }
    System.out.println("The number of turns is "+count);
}
}
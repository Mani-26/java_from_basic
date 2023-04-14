import java.util.*;
public class Collatz{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int inp=sc.nextInt();
    sc.close();
    int count=0;
    System.out.println(inp);
    if(inp!=1){
    while(inp!=1){
         if(inp%2==0){
            inp/=2;
            count++;
            System.out.println(inp);
        }
        else{
            inp=3*inp+1;
            count++;
            System.out.println(inp);
        }
    }
            System.out.println(count);
    }
    else{
        System.out.println(count);
    }
}
}
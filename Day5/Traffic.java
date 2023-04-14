
import java.util.*;
public class Traffic{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float s=sc.nextFloat();//speed
    float d=sc.nextFloat();//distance
    float t=sc.nextFloat();//signal time
    sc.close();
    float time=d/s*3600;
    if (time<=t){
     System.out.println("Yes");
    }
    else {
     System.out.println("No");
     }
    }
}
import java.util.*;
public class ThreeIdiots{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        float x3=(x1+x2)/2.0;
        float y3=(y1+y2)/2.0;
        System.out.printf("Binoy's house is located at ( "+"%.1f",(x3)+", "+"%.1f",(y3)+")");
    }
}


import java.util.*;
public class ThreeIdiots{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            double x3=(x1+x2)/2.0;
            double y3=(y1+y2)/2.0;
            System.out.printf("Binoy's house is located at ("+ x3 +","+ y3+ ")");
    }
}


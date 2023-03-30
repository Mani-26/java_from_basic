import java.util.*;
public class Inherit5{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int gear=s.nextInt();
        int speed=s.nextInt();
        int height=s.nextInt();
        MontaneBike mb=new MontaneBike();
        mb.gear(gear);
        mb.speed(speed);
        mb.height(height);
    }
}
class Bicycle{
    
}
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
    public void gear(int gear){
        System.out.println("No of gears are "+gear);
    }
    public void speed(int speed){
        System.out.println("speed of bicycle is "+speed);
    }
}
class MontaneBike extends Bicycle{
    public void height(int height){
        System.out.println("seat height is "+height);
    }
}
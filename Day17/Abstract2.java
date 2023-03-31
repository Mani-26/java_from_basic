import java.util.*;
public class Abstract2{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        Area a=new Area();
        a.length=s.nextInt();
        a.breadth=s.nextInt();
        a.side=s.nextInt();
        a.radius=s.nextInt();
        a.rectangleArea();
        a.squareArea();
        a.circleArea();
    }
}
abstract class Shape{
    public abstract void rectangleArea();
    public abstract void squareArea();
    public abstract void circleArea();
}
class Area extends Shape{
    public int length,breadth,side,radius;
    public void rectangleArea(){
        int area=length*breadth;
        System.out.println(area);
    }
    public void squareArea(){
        int area=side*side;
        System.out.println(area);
    }
    public void circleArea(){
        double area=(Math.PI*radius*radius);
        System.out.printf("%.2f",area);
    }
}
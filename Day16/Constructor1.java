import java.util.*;
public class Constructor1{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("1.Cube"+"\n"+"2.Sphere"+"\n"+"3.Cylinder");
        System.out.println("Enter the choice");
        int a=s.nextInt();
        if(a==1){
            System.out.println("length");
            int length=s.nextInt();
            System.out.println("breadth");
            int breadth=s.nextInt();
            System.out.println("height");
            int height=s.nextInt();
            Shape sh=new Shape(length,breadth,height);
            int area=sh.calculateAreaOfCube();
            System.out.println("Area of Cube is "+area);
        }
        if(a==2){
            System.out.println("radius");
            int radius=s.nextInt();
            Shape sh=new Shape(radius);
            float area=sh.calculateAreaOfSphere();
            System.out.printf("Area of sphere is "+"%.2f",area);
        }
        if(a==3){
            System.out.println("radius");
            int radius=s.nextInt();
            System.out.println("height");
            int height=s.nextInt();
            Shape sh=new Shape(radius,height);
            float area=sh.calculateAreaOfCylinder();
            System.out.println("Area of Cylinders is "+area);
        }
    }
}
class Shape{
    int length,breadth,height,radius;
    Shape(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        this.radius=radius;
    }
    public int calculateAreaOfCube(){
        return length*breadth*height;
    }
    Shape(int radius){
        this.radius=radius;
    }
    public float calculateAreaOfSphere(){
        return (4*3.14f*radius*radius*radius)/3;
    }
    Shape(int radius,int height){
        this.height=height;
        this.radius=radius;
    }
    public float calculateAreaOfCylinder(){
        return 3.14f*radius*radius*height;
    }
}
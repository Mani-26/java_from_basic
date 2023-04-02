import java.util.*;
public class Interface1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Square s=new Square();
        Circle c=new Circle();
        s.calc(n);
        c.calc(n);
    }
}
interface ShapeCalculator{
    void calc(int n);
}
class Square implements ShapeCalculator{
    public void  calc(int n){
        System.out.print(n*n+" ");
        System.out.println(4*n);
    }
}
class  Circle implements ShapeCalculator{
   public void  calc(int n){
        System.out.printf("%.2f",(float)3.14f*n*n);
        System.out.print(" ");
        System.out.printf("%.2f",(float)2*3.14f*n);
    }
}
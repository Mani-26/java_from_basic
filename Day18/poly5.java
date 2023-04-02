import java.util.*;
public class Poly5{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        double length=s.nextDouble();
        double width=s.nextDouble();
        double pocketSize=s.nextDouble();
        PoolTable pt=new PoolTable();
        pt.calculatePerimeter(length,width);
        pt.calculatePerimeter(pocketSize);
    }
}
class PoolTable{
    static double length,width,pocketSize;
    public void calculatePerimeter(double length,double width){
        this.length=length;
        this.width=width;
        double peri1=2*(length+width);
        System.out.println("Perimeter of pool table: "+peri1+" meters");
    }
    public void calculatePerimeter(double pocketSize){
        this.pocketSize=pocketSize;
        double peri1=2*(length+width+(2*pocketSize));
        System.out.println("Perimeter of pocket: "+peri1+" meters");
    }
}
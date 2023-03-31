import java.util.*;
public class Abstract1{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        A a=new A();
        B b=new B();
        a.Marks1=s.nextInt();
        a.Marks2=s.nextInt();
        a.Marks3=s.nextInt();
        b.Marks1=s.nextInt();
        b.Marks2=s.nextInt();
        b.Marks3=s.nextInt();
        b.Marks4=s.nextInt();
        a.getpercentage();
        b.getpercentage();
    }
}
abstract class Marks{
    public abstract void getpercentage();
}
class A extends Marks{
    public int Marks1,Marks2,Marks3;
    public void getpercentage(){
        double per=(Marks1+Marks2+Marks3)/3.0;
        System.out.printf("%.2f",per);
        System.out.println();
    }
}
class B extends Marks{
    public int Marks1,Marks2,Marks3,Marks4;
    public void getpercentage(){
        double per=(Marks1+Marks2+Marks3+Marks4)/4.0;
        System.out.printf("%.2f",per);
    }
}
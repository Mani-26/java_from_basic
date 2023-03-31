import java.util.*;
public class Abstract3{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double r1=sc.nextDouble();
        double i1=sc.nextDouble();
        double r2=sc.nextDouble();
        double i2=sc.nextDouble();
        Addition a=new Addition(r1,i1,r2,i2);
        Subtraction s=new Subtraction(r1,i1,r2,i2);
        Multiplication m=new Multiplication(r1,i1,r2,i2);
        Division d=new Division(r1,i1,r2,i2);
        a.add();
        s.sub();
        m.mul();
        d.div();
    }
}
class Complex{
    double r1,r2,i1,i2;
    void add(){}
    void sub(){}
    void mul(){}
    void div(){}
}
class Addition extends Complex{
    double r1,r2,i1,i2;
    Addition(double r1,double i1,double r2,double i2){
        this.r1=r1;
        this.i1=i1;
        this.r2=r2;
        this.i2=i2;
    }
    public void add(){
        double real=r1+r2;
        double img=i1+i2;
        System.out.println("Addition:");
        System.out.printf("\t%.4f",real);
        if(img>0)
            System.out.print(" +");
        else 
            System.out.print(" ");
        System.out.printf("%.4f",img);
        System.out.print(" i");
        System.out.println();
    }
}
class Subtraction extends Complex{
    double r1,r2,i1,i2;
    Subtraction(double r1,double i1,double r2,double i2){
        this.r1=r1;
        this.i1=i1;
        this.r2=r2;
        this.i2=i2;
    }
    public void sub(){
        double real=r1-r2;
        double img=i1-i2;
        System.out.println("Subtraction:");
        System.out.printf("\t%.4f",real);
        if(img>0)
            System.out.print(" +");
        else 
            System.out.print(" ");
        System.out.printf("%.4f",img);
        System.out.print(" i");
        System.out.println();
    }
}
class Multiplication extends Complex{
    double r1,r2,i1,i2;
    Multiplication(double r1,double i1,double r2,double i2){
        this.r1=r1;
        this.i1=i1;
        this.r2=r2;
        this.i2=i2;
    }
    public void mul(){
        double real=r1*r2-i1*i2; 
        double img=r1*r2+i1*i2;
        System.out.println("Multiplication:");
        System.out.printf("\t%.4f",real);
        if(img>0)
            System.out.print(" +");
        else
            System.out.print(" ");
        System.out.printf("%.4f",img);
        System.out.print(" i");
        System.out.println();
    }
}
class Division extends Complex{
    double r1,r2,i1,i2;
    Division(double r1,double i1,double r2,double i2){
        this.r1=r1;
        this.i1=i1;
        this.r2=r2;
        this.i2=i2;
    }
    public void div(){
        double real=((r1*r2)+(i1*i2))/((r2*r2)+(i2*i2));
        double img=((i1*r2)-(r2*i2))/((r2*r2)+(i2*i2));
        System.out.println("Division:");
        System.out.printf("\t%.4f",real);
        if(img>0)
            System.out.print(" +");
        else
            System.out.print(" ");
        System.out.printf("%.4f",img);
        System.out.print(" i");
        System.out.println();
    }
}
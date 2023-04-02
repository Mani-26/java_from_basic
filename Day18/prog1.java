import java.util.*;
public class prog1{
    public static void main(String []args){
        MultiplyFun m=new MultiplyFun();
        m.Multiply(2,6);
        m.Multiply(2,6,3);
    }
}
class MultiplyFun{
    void Multiply(int a,int b){
        int d=a*b;
        System.out.println(d);
    }
    void Multiply(int a,int b,int c){
        int d=a*b*c;
        System.out.println(d);
    }
}
import java.util.*;
public class Abstract4{
    public static void main(String []args){
        mani m=new mani();
        m.input();
        m.add();
        m.result();
    }
}
abstract class First{
    public abstract void input();
    public abstract void add();
    public abstract void result();
}
class mani extends First{
    public int a,b,add;
    public void input(){
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
    }
    public void add(){
        add=a+b;
    }
    public void result(){
        System.out.println(add);
    }
}
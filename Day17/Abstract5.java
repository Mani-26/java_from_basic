import java.util.*;
public class Abstract5{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        BankA a=new BankA();
        BankB b=new BankB();
        BankC c=new BankC();
        a.amnt=s.nextInt();
        b.amnt=s.nextInt();
        c.amnt=s.nextInt();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
abstract class Bank{
    public abstract void getBalance();
}
class BankA extends Bank{
    public int amnt;
    public void getBalance(){
        System.out.println("Deposited Balance is = "+amnt);
    }
}
class BankB extends Bank{
    public int amnt;
    public void getBalance(){
        System.out.println("Deposited Balance is = "+amnt);
    }
}
class BankC extends Bank{
    public int amnt;
    public void getBalance(){
        System.out.println("Deposited Balance is = "+amnt);
    }
}
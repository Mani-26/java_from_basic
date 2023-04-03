import java.util.*;
public class encapsulation2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Account ac[]=new Account[n];
        for(int i=0;i<n;i++){
            ac[i]=new Account();
            int number=s.nextInt();
            int balance=s.nextInt();
            ac[i].setnumber(number);
            ac[i].setbalance(balance);
        }
        int AcNo=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int k=ac[i].getnumber();
            if(k==AcNo){
                count++;
                System.out.println(ac[i].getbalance());
            }
        }
        if(count==0)
            System.out.println("Account Number does not exist");
    }
}
class Account{
    private int account_number;
    private int account_balance;
        void setnumber(int account_number){
            this.account_number=account_number;
        }
        int getnumber(){
            return account_number;
        }
        void setbalance(int account_balance){
            this.account_balance=account_balance;
        }
        int getbalance(){
            return account_balance;
        }
    }
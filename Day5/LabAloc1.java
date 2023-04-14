import java.util.*;
public class LabAloc1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int L1=sc.nextInt();
        int L2=sc.nextInt();
        int L3=sc.nextInt();
        sc.close();
        if(L1<L2){
            if(L1<L3){
                System.out.println("L1");
            }
            else{
                System.out.println("L3");
            }
        }
        else if(L2<L3){
            System.out.println("L2");
        }
        else{
            System.out.println("L3");
        }
    }
}
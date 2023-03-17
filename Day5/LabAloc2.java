import java.util.*;
public class LabAloc2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        String s=sc.nextLine();
        if(s.equals()"L1"){
            if(y < z){
                System.out.println("L2");
            }
            else{
                System.out.println("L3");

            }
        }
        else if(s.equals("L1")){
            if(x < z){
                System.out.println("L1");
            }
            else{
                System.out.println("L3");

            }
        }
        else if(s.equals("L1")){
            if(x < y){
                System.out.println("L1");
            }
            else{
                System.out.println("L2");

            }
        }
    }   
}
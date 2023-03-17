import java.util.*;
public class LabAloc4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        if(n<=x && n<=y && n<=z){
            if(x<=y && x<=z){
                System.out.println("L1");
        }
        else if(y<=z){
                System.out.println("L2");
            }
        else {
            System.out.println("L3");
        }
        }
        else if(n<=x && n<=y ){
                if(x<=y){
                    System.out.println("L1");
                }
                else{
                    System.out.println("L2");
                }
        }
        else if(n<=x && n<=z){
                if(x<=z){
                    System.out.println("L1");
                }
                else{
                    System.out.println("L3");
                }
        }
        else if(n<=y && n<=z ){
                if(y<=z){
                    System.out.println("L2");
                }
                else{
                    System.out.println("L3");
                }
         }
        else if(n<=x ){
                    System.out.println("L1");
        }
        else if(n<=y ){
                    System.out.println("L2");
        }
        else if(n<=z ){
                    System.out.println("L3");
        }
        else {
                    System.out.println("0");
        }
    }   
}
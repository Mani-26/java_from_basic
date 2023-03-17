import java.util.*;
public class LabAloc3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        if(n<=x && n<=y && n<=z){
                System.out.println("3");
        }
        else if(n<=x && n<=y || n<=y && n<=z ||n<=x && n<=z){
                System.out.println("2");
        }
        else if(n<=x || n<=y || n<=z){
                System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }   
}
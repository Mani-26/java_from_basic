import java.util.*;
public class encapsulation1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String arr[][]=new String[n][4];
        s.nextLine();
        for(int i=0;i<n;i++){
            for(int j=1;j<=3;j++){
                arr[i][j]=s.nextLine();
            }
        }
        String comp=s.nextLine();
        Employee emp=new Employee(arr,comp,n);
    }
}
class Employee{
    private String eName; 
    private int eId; 
    private int eSalary; 
    static String comp;
    public int n;
    Employee(String arr[][],String comp,int n){
        for(int i=0;i<n;i++){
                System.out.println("Employee Name: "+arr[i][1]);
                System.out.println("Employee ID: "+arr[i][2]);
                System.out.println("Employee Salary: "+arr[i][3]);
                System.out.println("Employee Company Name: ABC Corp");
        }
        System.out.println("Updated Details");
        for(int i=0;i<n;i++){
                System.out.println("Employee Name: "+arr[i][1]);
                System.out.println("Employee ID: "+arr[i][2]);
                System.out.println("Employee Salary: "+arr[i][3]);
                System.out.println("Employee Company Name: "+comp);
        }
    }
}
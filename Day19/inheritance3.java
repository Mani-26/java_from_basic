import java.util.*;
public class inheritance3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int empId=s.nextInt();
        float salary=s.nextFloat();
        empLevel el=new empLevel();
        el.level(empId,salary);
    }
}
class Employee{
    int empId;
    float salary;
}
class empLevel extends Employee{
    public void level(int empId,float salary){
        System.out.print(empId +"\n"+salary+"\n");
        if(salary<101)
            System.out.print("2");
        else
            System.out.print("1");
    }
}

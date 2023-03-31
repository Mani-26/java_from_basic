import java.util.*;
public class Constructor2{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Name: ");
        String name=s.next();
        System.out.println("Id: ");
        int id=s.nextInt();
        System.out.println("Department: ");
        String dept=s.next();
        Student original=new Student(id,name,dept);
        Student duplicate=new Student(original);
        original.display();
    }
}
class Student{
    int id;
    String name,dept;
    Student(int id, String name, String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
        System.out.println("Original:- ");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department Id: "+id);
        System.out.println("Department: "+dept);
    }
    Student (Student s){}
    void display(){
        System.out.println("Duplicate:- ");
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department Id: "+id);
        System.out.println("Department: "+dept);
    }
}
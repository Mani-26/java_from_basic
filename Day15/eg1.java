// create  2 class named as teacher (parent class), student (child class) 
// in teacher class create 2 methods teacher name, teacher age
// in chlid class create 2 methods student name ,student age and create a main class an d access the methods from parent class and child class
// o/p print all
import java.util.*;
public class eg1{
    public static void main(String []args){
        student a=new student();
        a.t_name();
        a.t_age();
        a.s_name();
        a.s_age();
    }
}
class teacher{
     void t_name(){
        System.out.println("Teacher name : Mahes");
    }
     void t_age(){
        System.out.println("Teacher age : 25");
    }
}
class student extends teacher{
     void s_name(){
        System.out.println("Student name : Mani");
    }
     void s_age(){
        System.out.println("Student age : 20");
    }
}
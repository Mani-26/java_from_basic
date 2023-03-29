import java.util.*;
public class eg2{
    public static void main(String []args){
        student s=new student();
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int c=sc.nextInt();
        String d=sc.next();
        s.setage(b);
        s.setid(c);
        s.setname(d);
        System.out.println(s.getage());
        System.out.println(s.getid());
        System.out.println(s.getname());
    }
}
class teacher{
    int age,id;
    void setage(int a){
        age = a;
    }
    void setid(int i){
        id = i;
    }
    int getage(){
        return age;
    }
    int getid(){
        return id;
    }
}
class student extends teacher{
    String name;
    void setname(String n){
        name = n;
    }
    String getname(){
        return n ame;
    }
}
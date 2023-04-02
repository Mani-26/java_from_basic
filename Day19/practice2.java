import java.util.*;
public class practice2{
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        String name1=sc.next();
        String username1=sc.next();
        String password1=sc.next();
        String mobile1=sc.next();
        String name2=sc.next();
        String username2=sc.next();
        String password2=sc.next();
        String mobile2=sc.next();
        User u1=new User(name1,username1,password1,mobile1);
        User u2=new User(name2,username2,password2,mobile2);
        String s1=u1.getmobile();
        String s2=u2.getmobile();
        if(s1.equals(s2))
            System.out.println("User 1 and User 2 are equal");
        else
             System.out.println("User 1 and User 2 are not equal");    
    }
}
class User{
    String name,username,password,mobile;
    User(String name,String username,String password,String mobile){
       this.name=name;
       this.username=username;
       this.password=password;
       this.mobile=mobile;
    }
    String getname(){
        return name;
    }
    String getusername(){
        return username;
    }
    String getpassword(){
        return password;
    }
    String getmobile(){
        return mobile;
    }
}
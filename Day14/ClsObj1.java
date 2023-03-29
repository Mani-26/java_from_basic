public class ClsObj1 {
    public static void main(String []args){
        message msg=new message();
        hello hlo=new hello();
        msg.message();
        hlo.hello();
    }
}
class message{
    public static void message(){
        System.out.print("Welcome ");
    }
}
class hello{
    public static void hello(){
        System.out.print("Hello");
    }
}
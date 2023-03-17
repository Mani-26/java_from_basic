import java.util.*;
public class quiz{
    public static void main(String args[]){
        int var1=5;
        int var2=6;
        int var3;
        System.out.println("Before execution"+"\n"+"var1="+var1+"\n"+"var2="+var2);
        var3=++var2 *var1 / var2+var2;
        System.out.println("After execution"+"\n"+"var3="+var3+"\n"+"var1="+var1+"\n"+"var2="+var2);
    }
}    
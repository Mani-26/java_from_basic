import java.util.*;
public class Interface2{
    public static void main(String args[]){
        move m=new move();
        System.out.println(m.count());
    }
}
interface array{
    public int count(); 
}
class move implements array{
    public int count(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(b==a[i])
                b--;
        }
        return b;
   }
}
import java.util.*;
public class Apple{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int apple[] = new int[n];
    int apple1[] = new int[n];
    int add[] = new int[n];
    for (int i=0;i<n;i++) {
        apple[i]=sc.nextInt();
    }
    for (int i=0;i<n;i++) {
        apple1[i]=sc.nextInt();
    }
        for (int i=0;i<n;i++) {
            add[i]=apple[i]+apple1[i];
            System.out.print(add[i]+" ");
        }
}
}
import java.util.*;
public class Distinct{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    int m=0;
    int array[] = new int[n];
    for (int i=0;i<n;i++) {
        array[i]=sc.nextInt();
    }
        for (int i=0;i<n;i++) {
            if(array[i]!=m){
                m=array[i];
                count++; 
            }
        }
    System.out.println(count); 
}
}
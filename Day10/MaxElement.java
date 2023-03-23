import java.util.*;
public class MaxElement{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int drop[] = new int[n];
    for (int i=0;i<n;i++) {
        drop[i]=sc.nextInt();
    }
    int max=drop[0];
        for (int i=0;i<n;i++) {
            if(drop[i]>max){
                max = drop[i];
            }
        }
        System.out.println(max+" is the maximum element in the array");
}
}
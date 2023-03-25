import java.util.*;
public class CompareArray{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    int array1[] = new int[n];
    int array2[] = new int[n];
    for (int i=0;i<n;i++) {
        array1[i]=sc.nextInt();
    }
    for (int i=0;i<n;i++) {
        array2[i]=sc.nextInt();
    }
        for (int i=0;i<n;i++) {
            if(array1[i]==array2[i]){
                count++;
            }
        }
    if(count==n)
        System.out.print("yes");
    else
        System.out.print("no");
}
}
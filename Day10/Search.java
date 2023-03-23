import java.util.*;
public class Search{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    int array[] = new int[n];
    for (int i=0;i<n;i++) {
        array[i]=sc.nextInt();
    }
    int m=sc.nextInt();
        for (int i=0;i<n;i++) {
            if(array[i]==m){
                count++; 
            }
        }
        if(count!=0){
                System.out.println(m+" is present in the array"); 
            }
            else{
                System.out.println(m+" is not present in the array"); 
            }
}
}
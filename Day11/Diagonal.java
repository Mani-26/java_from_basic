import java.util.*;
public class Diagonal{
public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){        
                if((arr[i][j]!=0) && i!=j){  
                    count++;      
                }
            }
        }
        if(count>0){
            System.out.println("no");
        }
        if(count==0){
            System.out.println("yes");
        }
    }
}
import java.util.*;
public class UpperAlt{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[j][i]==0)
                    System.out.println("Yes");
                else
                    System.out.println(" No"); 
            }
        }
    }
}
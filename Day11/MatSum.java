import java.util.*;
public class MatSum{
public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        int sum=arr[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){    
                sum=sum + arr[i][j];           
            }
        }
            System.out.println("The sum of the elements in the matrix is " + sum);
        }
}
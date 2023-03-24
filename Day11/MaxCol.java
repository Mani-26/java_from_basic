import java.util.*;
public class MaxCol{
public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if (arr[j][i]>max){
                max=arr[j][i];
            }
        }
        System.out.println(max);
        max=1;
        }
    }
}
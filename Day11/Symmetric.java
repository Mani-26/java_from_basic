import java.util.*;
public class Symmetric{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0,k=1;
        int arr[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=n-1;i<n;i++){
            for(int j=0;j<n;j++){
                if (arr[i][j]!=arr[j][i])
                    k=0;
            }
        }
            if (k==1)
                System.out.println("Symmetric");
            else
                System.out.println("Not symmetric");
    }
}
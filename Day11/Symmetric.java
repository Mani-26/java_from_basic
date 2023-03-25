import java.util.Scanner;
public class Symmetric{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int m=sc.nextInt();
        int arr[][]=new int[m][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                if(i==0){
                    if(arr[0][j]==arr[j][0]){
                        count++;
                    }
                }
            }
                System.out.println(" ");
        }
}
}
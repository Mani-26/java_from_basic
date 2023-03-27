import java.util.Scanner;
public class Upper{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if ((i>j)&&(arr[i][j]==0)){
                    System.out.println("yes");
                }
                else{
                    System.out.println(" No");
                }   
            }
        }
    }
}
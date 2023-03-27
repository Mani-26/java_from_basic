import java.util.Scanner;
public class lower{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    int count=0;
    for (int i=0;i<n;i++){
        for(int j=0;j<n;j++) {
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<i-1;j++){
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
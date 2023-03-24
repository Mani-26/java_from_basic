import java.util.Scanner;
public class Uniformity{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int even=0,odd=0;
        int s=n*n;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (arr[i][j]%2==0){
                    even++;
                }
                else if(arr[i][j]%2==1){
                    odd++;
                }    
            }
        }
        if((even==s)||(odd==s)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
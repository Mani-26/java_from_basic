import java.util.Scanner;
public class FuncArray{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int even=0,odd=0;
        System.out.println("Enter the elements in the array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (arr[i]%2==0){
            even++;
            }
            else if(arr[i]%2==1){
            odd++;
            }    
        }
        if(even==n){
            System.out.println("The array is even");
        }
        else if(odd==n){
            System.out.println("The array is odd");
        }
        else{
            System.out.println("The array is mixed");
        }
    }
}
import java.util.*;
public class interface4{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              matrix[i][j]=s.nextInt();
            }
        }
        Main m=new Main();
        m.diagonalsMinMax(matrix,n);
    }
}
interface Matrix{
    void diagonalsMinMax(int matrix[][],int n); 
}
class Main implements Matrix { 
    public int n;
    public void diagonalsMinMax(int matrix[][], int n){ 
        this.n=n;
        int min1=matrix[0][0];
        int max1=matrix[0][0];  
        int min2=matrix[n-1][0];
        int max2=matrix[n-1][0];
        for (int i=0;i<n;i++){ 
            for (int j=0;j<n;j++){ 
                if (i==j){ 
                    if(matrix[i][j]<min1)
                        min1=matrix[i][j]; 
                    if(matrix[i][j]>max1) 
                        max1=matrix[i][j]; 
                }
                if((i+j)==(n-1)){ 
                    if(matrix[i][j]<min2)
                        min2=matrix[i][j]; 
                    if(matrix[i][j]>max2)
                        max2=matrix[i][j];
                } 
            } 
        } 
        System.out.println("Smallest Element - 1: "+min1); 
        System.out.println("Greatest Element - 1: "+max1); 
        System.out.println("Smallest Element - 2: "+min2); 
        System.out.println("Greatest Element - 2: "+max2); 
    }
}
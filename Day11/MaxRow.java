import java.util.*;
public class MaxRow{
public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][]=new int[n][m];
		for (int i=0;i<n;i++){
		    for (int j=0;j<m;j++){
		        a[i][j]=sc.nextInt();
		    } 
        }	
		for (int i=0;i<n;i++){
		    int b = a[i][0];
		    for (int j=0;j<m;j++){
		        if(b<a[i][j]){
		           b=a[i][j];
		        }
		    }
            System.out.println(b); 
        } 
	}
}
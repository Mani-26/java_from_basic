import java.util.Scanner;
class Main
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[][]=new int[n][n];
     int r1=0,r2=0,c1=0,c2=0,d1=0,d2=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
    }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
        if( i==0){
             r1=r1+arr[i][j];
        }
        if( i==1){
             r2=r2+arr[i][j];
        }
        if( j==0){
             c1=c1+arr[i][j];
        }
       if( j==1){
         c2=c2+arr[i][j];
        } 
        if( i==j)
        {
         d1=d1+arr[i][j];
        }
        if(i+j==n-1)
        {
            d2=d2+arr[i][j];
        }
        }}
    if(r1==c1 && r2==c2 && d1==d2){
        System.out.println("Yes");
    }
    else{
         System.out.println("No");
    }
    }
}
    import java.util.Scanner;
    public class MagicSquare{
    public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();
            if(n>5){
                System.out.println("Invalid Input");
            }
            else{
            int arr[][]=new int[n][n];
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            int row1=0,row2=0,row3=0,row4=0,row5=0,col1=0,col2=0,col3=0,col4=0,col5=0,a=0,b=0;
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if(i==0){
                        row1+=arr[i][j];
                    }
                    if(i==1){
                        row2+=arr[i][j];
                    }
                    if(i==2){
                        row3+=arr[i][j];
                    }
                    if(i==3){
                        row4+=arr[i][j];
                    }
                    if(i==4){
                        row5+=arr[i][j];
                    }
                    if(j==0){
                        col1+=arr[i][j];
                    }
                    if(j==1){
                        col2+=arr[i][j];
                    }
                    if(j==2){
                        col3+=arr[i][j];
                    }
                    if(j==3){
                        col4+=arr[i][j];
                    }
                    if(j==4){
                        col5+=arr[i][j];
                    }
                    if(i==j){
                        a+=arr[i][j];
                    }
                    if((i+j)==n-1){
                        b+=arr[i][j];
                    }
                }
            }
            if(n==2){
                if(row1==col1 && row2==col2 && a==b){
                    System.out.println("yes");
                }
                else{
                System.out.println("no");
                }
            }
            if(n==3){
                if(row1==col1 && row2==col2 && row3==col3 && a==b){
                    System.out.println("yes");
                }
                else{
                System.out.println("no");
                }
            }
            if(n==4){
                if(row1==col1 && row2==col2 && row3==col3 && row4==col4 && a==b){
                    System.out.println("yes");
                }
                else{
                System.out.println("no");
                }
            }
            if(n==5){
                if(row1==col1 && row2==col2 && row3==col3 && row4==col4 && row5==col5 && a==b){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }
    }
    }
                    
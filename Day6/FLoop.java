import java.util.Scanner;
public class FLoop{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int totalBench=sc.nextInt();
  sc.close();
  for(int i=1; i<=totalBench; i++){
    if(i%2==0){
        System.out.println("12th Student can be seated");
    }
    else{
        System.out.println("10th Student can be seated");
    }
  }
}
}
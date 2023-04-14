import java.util.Scanner;
public class whileLOOP{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int dist=sc.nextInt();
  sc.close();
  int i=1,count=0;
  while(dist>0){
    if(i%5==0){
        count++;}
    i++;
    dist--;  }  
    System.out.println("No.of.Speed Breakers found:" + count);
  }
}


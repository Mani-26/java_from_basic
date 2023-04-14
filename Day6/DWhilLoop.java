import java.util.Scanner;
public class DWhilLoop{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String channel=sc.next();
  sc.close();
  do{
    System.out.println(channel + " channel is playing now");
  }
  while(channel.equals("news"));
    System.out.println("turn of the TV");
  }
}


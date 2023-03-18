import java.util.Scanner;
public class dowhileLOOP{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int time=0;
  String channel=sc.next();
  do{
    System.out.println(channel + " channel is playing now");
  }
  while(channel.equals("news"));
    System.out.println("turn of the TV");
  }
}


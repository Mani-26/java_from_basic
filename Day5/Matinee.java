import java.util.Scanner;
public class Matinee{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int age=sc.nextInt();
  float show=sc.nextFloat();
  if(show==13.30f)
  {
      if(age>13)
        System.out.println("$5.00");
       else
        System.out.println("$2.00");
  }
  else if(show!=13.30f)
  {
      if(age>13)
        System.out.println("$8.00");
      else
        System.out.println("$4.00");
  }
}
}
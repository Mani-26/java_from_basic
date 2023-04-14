import java.util.*;
public class Circle{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x1=sc.nextInt();
int y1=sc.nextInt();
int r1=sc.nextInt();
int x2=sc.nextInt();
int y2=sc.nextInt();
int r2=sc.nextInt();
sc.close();
double d=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
if ((int)d>(r1+r2)){
    System.out.println("Do not Overlap");
}
else if ((int)d==(r1+r2)){
    System.out.println("Tangential");
}
else{
System.out.println("Overlap");
}
}
}
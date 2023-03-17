import java.util.Scanner;
public class Sece{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
int x = sc.nextInt();
if (str.equals("front") && x==1){
    System.out.println("Left Handed");
}
else if(str.equals("front") && x==0){
    System.out.println("Right Handed");
}
else if(str.equals("rear")&& x==1){
    System.out.println("Right Handed");
}
else if (str.equals("rear") && x==0){
    System.out.println("Left Handed");
}
else{
    System.out.println("Invalid Input");
}
}
}
import java.util.Scanner;
public class Oven{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    float t=sc.nextFloat();
    if(a==1){
        System.out.printf("%.2f", t);
    }
    else if(a==2){
        System.out.printf("%.2f", t*1.5);
    }
    else if(a==3){
        System.out.printf("%.2f", t*2.0);
    }
    else{
        System.out.printf("Number of items is more");

    }
}
}
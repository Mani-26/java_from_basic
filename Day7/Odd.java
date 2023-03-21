import java.util.*;
public class Odd{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int inp=sc.nextInt();
    float mark=0,count=0;
    while(inp>0){
        if(inp%2!=0){
            mark+=1;
            count++;
        }
        else{
            mark-=0.5;
        }
        if(count==3){
            break;
        }
        inp=sc.nextInt();
        }
    if(inp<0){
            mark-=1;
    }
    System.out.printf("%.1f",mark);
}
}
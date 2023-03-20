import java.util.*;
public class Odd{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int inp1=sc.nextInt();
    int inp2=sc.nextInt();
    int inp3=sc.nextInt();
    float mark=0;
    if(inp1%2!=0 && inp1>0){
        mark+=1;
            if(inp2%2!=0 && inp2>0){
            mark+=1;
                if(inp3%2!=0 && inp3>0){
                mark+=1;
                }
                else if(inp3%2==0 && inp1>0){
                mark-=0.5;
                }
            }
            else if(inp2%2==0 && inp1>0){
            mark-=0.5;
                if(inp3%2!=0 && inp3>0){
                mark+=1;
                }
                else if(inp3%2==0 && inp1>0){
                mark-=0.5;
                }
            }  
    }
    else if(inp1%2==0 && inp1>0){
        mark-=0.5;
    }
    else{
        mark-=1;
    }
    System.out.printf("%.1f",mark);
}
}
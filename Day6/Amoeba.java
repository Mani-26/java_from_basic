import java.util.*;
public class Amoeba{
public static void main(String args[]){
    //0,1,1,2,3,5,8,13,21,34,55,89
    Scanner sc=new Scanner(System.in);
    int mth=sc.nextInt();
    sc.close();
    int a=0,b=1,c=a+b,i;
    if(mth==1){
        System.out.println(a);
    }
    else if(mth==2){
        System.out.println(b);
    }
    else if(mth==3){
        System.out.println(c);
    }
    else {
        for(i=4;i<=mth;i++){
        a=b;
        b=c;
        c=a+b;    
    }
    System.out.println(c);
    }
}
}
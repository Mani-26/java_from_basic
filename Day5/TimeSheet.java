import java.util.*;
public class TimeSheet{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int sun=sc.nextInt();
    int mon=sc.nextInt();
    int tue=sc.nextInt();
    int wed=sc.nextInt();
    int thu=sc.nextInt();
    int fri=sc.nextInt();
    int sat=sc.nextInt();
    int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0;
    s1=sun*150;
    s2=sat*125;
    if(mon<=8){
        s3=mon*100;
    }
    else if(mon>8){
        int d=mon-8;
        s3= (mon*100)+(d*15);
    }
    if(tue<=8){
        s4=tue*100;
     
    }
    else if(tue>8){
        int a=tue-8;
        s4= (tue*100)+(a*15);
    }
    if(wed<=8){
        s5=wed*100;
    }
    else if(wed>8){
        int b=wed-8;
        s5= (wed*100)+(b*15);
    }
    if(thu<=8){
        s6=thu*100;
    }
    else if(thu>8){
        int c=thu-8;
        s6= (thu*100)+(c*15);
    }
    if(fri<=8){
        s7=fri*100;
    }
    else if(fri>8){
        int d=fri-8;
        s7= (fri*100)+(d*15);
    }
    int salary=(s1+s2+s3+s4+s5+s6+s7);
    System.out.println(salary); 
}
}
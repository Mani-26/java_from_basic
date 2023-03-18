import java.util.Scanner;
public class TimeSheet{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int sun=sc.nextInt();
    int mon=sc.nextInt();
    int tue=sc.nextInt();
    int wed=sc.nextInt();
    int thu=sc.nextInt();
    int fri=sc.nextInt();
    int sat=sc.nextInt();
    int sur,mor,tur,wer,thr,frr,sar,th,tot;
        sur=sun*150;
        mor=mon*100;
        tur=tue*100;
        wer=wed*100;
        thr=thu*100;
        frr=fri*100;
        sar=sat*100;
        tot=sur+mor+tur+wer+thr+frr+sar;
    if(sun<=8){
        sur=sun*150;
    }
    else if(sun>8){
        sur+=((sun-8)*15);  
    }
    if(mon<=8){
        mor=mon*100;
    }
    else if(mon>8){
        mor+=((mon-8)*15);
    }
    if(tue<=8){
        tur=tue*100;
    }
    else if(tue>8){
        tur+=((tue-8)*15);
    }
    if(wed<=8){
        wer=wed*100;
    }
    else if(wed>8){
        wer+=((wed-8)*15);
    }
    if(thu<=8){
        thr=thu*100;
    }
    else if(thu>8){
        thr+=((thu-8)*15);
    }
    if(fri<=8){
        frr=fri*100;
    }
    else if(fri>8){
        frr+=((fri-8)*15);
    }
    if(sat<=8){
        sar=sat*100;
    }
    else if(sat>8){
        sar+=((sat-8)*15);
    }
    th=sun+mon+tue+wed+thu+fri+sat;
    if(th<=40){
        tot=sur+mor+tur+wer+thr+frr+sar;
    }
    else if(th>40){
        tot+=((sur+mor+tur+wer+thr+frr+sar)-40)*25;
    }
    System.out.println(tot);
}
}
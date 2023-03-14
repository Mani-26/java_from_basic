import java.util.*;
public class TeamSplit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Stud=sc.nextInt();
        int Team=sc.nextInt();
        System.out.println("The number of students in each team is "+(Stud/Team)+" and left out is "+(Stud % Team));
    }
}
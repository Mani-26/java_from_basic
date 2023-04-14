import java.util.*;
public class SeatBelts{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        sc.nextLine();
		int a=0,b=0,c=0;
		for(int i=0;i<n;i++){
		    String str=sc.nextLine();
		    if(str.equals("yes"))
		        a++;
            else if(str.equals("no"))
		        b++;
            else
                c++;
		}
		sc.close();
		if(a==n)
		    System.out.println("Yes I can drive");
		else if(b!=0)
		    System.out.println("No I can't drive");
		else if(c!=0)
		    System.out.println("Invalid Input");
	}
}
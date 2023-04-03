import java.util.*;
public class interface5{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int bank=sc.nextInt();
		int type=sc.nextInt();
		Icici k=new Icici();
		Hdfc m=new Hdfc();
		if(bank==1) {
			if(type==1)
				k.notificationBySms();
			else if (type==2)
				k.notificationByEmail();
			else if (type==3)
				k.notificationByCourier();
			else
				System.out.println("Invalid Input");
		}
		else if (bank==2){
			if(type==1)
				m.notificationBySms();
			else if (type==2)
				m.notificationByEmail();
			else if (type==3)
				m.notificationByCourier();
			else
				System.out.println("Invalid Input");
		}
		else
			System.out.println("Invalid Input");		
	}	
}
interface Notification{
	void notificationBySms();
	void notificationByEmail();
	void notificationByCourier();
}
class Icici implements Notification{
    public void notificationBySms() {
		System.out.println("ICICI - Notification by SMS");
	}
	public void notificationByEmail() {
		System.out.println("ICICI - Notification by Email");
    }
	public void notificationByCourier() {
		System.out.println("ICICI - Notification by Courier");	
	}
}
class Hdfc implements Notification{
	public void notificationBySms() {
		System.out.println("HDFC - Notification by SMS");
	}
	public void notificationByEmail() {
		System.out.println("HDFC - Notification by Email");	
	}
	public void notificationByCourier() {
		System.out.println("HDFC - Notification by Courier");
	}
}
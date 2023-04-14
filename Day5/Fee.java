import java.util.Scanner;
public class Fee{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student type");
        String a=sc.nextLine();
        if(a.equals("MSDS"))
        {
            System.out.println("Enter tuition fee");
            float tf=sc.nextFloat();
            System.out.println("Enter  bus fee");
            float bf=sc.nextFloat();
            System.out.printf("The fees to be paid by the student is Rs.%.2f",tf+bf);
        }
        else if(a.equals("MSH"))
        {
            System.out.println("Enter  tuition fee");
            float tf=sc.nextFloat();
            System.out.println("Enter  hostel fee");
            float hf=sc.nextFloat();
            System.out.printf("The fees to be paid by the student is Rs.%.2f",tf+hf);
        }
        else if(a.equals("MGSDS"))
        {
            System.out.println("Enter tuition fee");
            float tf=sc.nextFloat();
            System.out.println("Enter bus fee");
            float bf=sc.nextFloat();
            System.out.printf("The fees to be paid by the student is Rs.%.2f",1.5f*tf+bf);
        }
             else if(a.equals("MGSH"))
        {
            System.out.println("Enter  tuition fee");
            float tf=sc.nextFloat();
            System.out.println("Enter  hostel fee");
            float hf=sc.nextFloat();
            System.out.printf("The fees to be paid by the student is Rs.%.2f",1.5f*tf+hf);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
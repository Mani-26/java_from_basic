import java.util.*;
public class HotelTariff{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mnth=sc.nextInt();
        float rent=sc.nextFloat();
        int days=sc.nextInt();
        float normal=rent*days;
        float peak=1.2f*rent*days;
        switch(mnth){
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
            System.out.printf("%.2f", peak);
            break;
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.printf("%.2f", normal);
            break;
            default:
            System.out.printf("Invalid Input");
        }
    }
}
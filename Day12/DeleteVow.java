import java.util.*;
public class DeleteVow{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        System.out.print("The output string is ");
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                continue;}
            else{
                System.out.print(a);
            }
        }
}
}
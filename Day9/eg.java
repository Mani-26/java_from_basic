import java.util.*;
public class eg{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int i, j, k, s;
    int a = 1;
    int b = d*d + 1;
    for (i = d; i >= 1; i--){
        for (s = 0; s < d - i; s++)
        System.out.printf(" ");
        for (j = 0; j < i; j++)
        System.out.printf("%d*", a++);
        for (k = 0; k < i - 1; k++)
        System.out.printf("%d*", b++);
        System.out.printf("%d\n", b);
        b -= 2*(i - 1);
    }
    }
}
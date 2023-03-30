import java.util.*;
public class Inherit{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price =sc.nextInt();
        Mybook mb=new Mybook(title, author, price);
        mb.display();
    }
}
class book{
    String title;
    String author;
}
class Mybook extends book{
    int price;
    Mybook(String title,String author,int price){
        this.price=price;
        this.author=author;
        this.title=title;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
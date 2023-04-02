import java.util.*;
public class Poly3{
    public static void main(String []args){
        Animal a;
        a=new Dog();
        a.Print();
        a=new Cat();
        a.Print();
    }
}
class Animal{
    void Print(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void Print(){
        System.out.println("Dog");
    }
}
class Cat extends Animal{
    void Print(){
        System.out.println("Cat");
    }
}
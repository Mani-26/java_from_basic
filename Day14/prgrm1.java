public class prgrm1{
    public static void main(String args[]){
        movie mv=new movie();
        mv.kathi();
        mv.raangi();
        mv.dada();
        System.out.println("Ticket price is "+mv.tp);
    }
}
class movie{
    public static void kathi(){
        System.out.println("Actor is Vijay");
    }
    public static void raangi(){
        System.out.println("Actor is Aalim");
    }
    public static void dada(){
        System.out.println("Actor is Kavin");
    }
    static int tp=200;
}
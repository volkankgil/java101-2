package methoddersi;

public class recursive1 {

    static void print (){
        System.out.println("Hello world");
        print();}

    public static void main(String[] args) {
        print();
    }
}

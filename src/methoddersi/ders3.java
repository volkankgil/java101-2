package methoddersi;

public class ders3 {

    static void print(){
        System.out.println("parametresiz metod");
    }
        static void print(int a){
            System.out.println("paremetre: " +a);
        }

        static int print (int a,int b){
        return a+b;
    }

        static int print(int a,int b,int c){
            return a*b*c;

        }

    public static void main(String[] args) {

        print();
        print(12);
        System.out.println(print(3,4));
        System.out.println(print(3,4,5));

    }

}

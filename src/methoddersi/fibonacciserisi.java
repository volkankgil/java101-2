package methoddersi;

public class fibonacciserisi {

    static int fibonacci(int n){

        if (n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(9));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(6));
    }
}

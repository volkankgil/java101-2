package methoddersi;
import java.util.Scanner;

public class recursiveasalsayı {
    public static boolean isAsal(int n, int i) {
        if ((i >= n) || (n == 2)) {
            return true;
        }
        if ((n % i == 0) || (n < 2)) {
            return false;
        }
        return isAsal(n, i + 1);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz : ");
        int n = inp.nextInt();
        String str = (isAsal(n, 2)) ? "Asal" : "Asal degil";
        System.out.println(str);
    }
}

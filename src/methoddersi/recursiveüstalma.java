package methoddersi;

public class recursiveüstalma {
    static int üst (int alt,int üst) {

        if (üst == 0 || alt == 1) {
            return 1;
        }
        int result= üst(alt,üst-1)*alt;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(üst(2,4));
        System.out.println(üst(3,0));
    }
}

package methoddersi;

public class recursive�stalma {
    static int �st (int alt,int �st) {

        if (�st == 0 || alt == 1) {
            return 1;
        }
        int result= �st(alt,�st-1)*alt;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(�st(2,4));
        System.out.println(�st(3,0));
    }
}

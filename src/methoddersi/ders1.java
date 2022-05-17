package methoddersi;

public class ders1 {
    static void helloworld(){
        System.out.println("patika harika");
    }
    static int power(int alt,int üst){
        int result =1;
        for(int i=1;i<=üst;i++){
        result*=alt;
    }
    return result;
    }

    public static void main(String[] args) {
        //f(x) = 2x+5
        //f(3) = 2*3+5=11

    /*    int alt = 2, üst = 3, sonuc = 1;

        for (int i = 1; i <= üst; i++) {
            sonuc *= alt;
        }

        System.out.println(sonuc);

        alt = 3;
        üst = 4;
        sonuc = 1;
        for (int i = 1; i <= üst; i++) {
            sonuc *= alt;
        }
            System.out.println(sonuc);
*/

       int case1=power(2,5);
        System.out.println(case1);

        int n1=4, n2=3;
        int case2 =power(n1,n2);
        System.out.println(case2);

        System.out.println(power(2,6));
        System.out.println(power(0,12));

       helloworld();
       helloworld();
       helloworld();



        }
    }


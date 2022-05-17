package methoddersi;

public class recursive2 {
static int f(int n) {
    int result=0;
    int i;
    for (i = 1; i <= n;i++){
        result += i;
    }
    return result;
}
static int r(int n) {
    /*System.out.println(n);
    return r(n-1)+n;*/


    if (n == 1) {
        return 1;//return 5 yazar isek n 1'e eþit olduðunda 5 ile toplar .

    }
        return r(n-1)+n;
    }


    public static void main(String[] args) {
        System.out.println(f(14 ));

        System.out.println(r(10));

        /* f(1) = 1;
           f(2) = f(1)+2; (1+2)
           f(3) = f(2)+3; (1+2+3)
           f(4) = f(3)+4; (1+2+3+4)
           ....
           ....
           .....
           f(n) (f(n-1)+n
         */
    }
}

package methoddersi;

public class ders2 {

        static void eksi (int a,int b){
        int sonuc;
        sonuc=a-b;
        System.out.println(sonuc);
    }



        static int sum(int a, int b){
        int result;
        result =a;//return 'de atamasýnýndaki deðer ne ise onu verir.returnden önceki iþlmeleri dikkate almaz.
        return a+b;
    }
    public static void main(String[] args) {
       int result = sum(10,9);
        System.out.println(result);
        System.out.println(sum(98,2));

        int result2 =sum(7,8)+sum(10,1);
        System.out.println(result2);

        eksi(10,7);
        eksi(28,17);

        int g=sum(4,5);
        System.out.println(g);


    }
}

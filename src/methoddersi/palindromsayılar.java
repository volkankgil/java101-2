package methoddersi;



public class palindromsay�lar {

    static boolean ispalindrom(int number) {
        int temp = number, reversenumber = 0, lastnumber;


        while (temp != 0) {

            System.out.println("------");
            System.out.println("say� giriniz: " + temp);

            lastnumber = temp % 10;
            System.out.println("son basamak" + lastnumber);

            reversenumber = (reversenumber * 10) + lastnumber;
            System.out.println("YEN� SAYI :" + reversenumber);
            temp /= 10;
            System.out.println("yeni temp" + temp);
        }


/*
        x % 10 = newnumber;
        System.out.println(newnumber);

        newnumberr = (newnumber*10)+lastnumber;
*/
        if (number == reversenumber){
            return true;
                  }else{return false;}

    }
    public static void main(String[] args) {


        System.out.println(ispalindrom(1582147));


        /*int a = number % 10
        sout (a) = bir say�n�n 10 a b�l�m�say�n�n son basama��n� verir.

        int a = number / 10 yapar isek java bir say�n�n son basama��n� siliyor.
        2476 say�s� der isek 10 a b�l�m� 246,7 olaca�� i�in integer da tam say�lar oldu�u i�in 246 geri d�nd�r�r*/
    }

}

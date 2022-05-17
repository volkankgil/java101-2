package methoddersi;



public class palindromsayılar {

    static boolean ispalindrom(int number) {
        int temp = number, reversenumber = 0, lastnumber;


        while (temp != 0) {

            System.out.println("------");
            System.out.println("sayı giriniz: " + temp);

            lastnumber = temp % 10;
            System.out.println("son basamak" + lastnumber);

            reversenumber = (reversenumber * 10) + lastnumber;
            System.out.println("YENİ SAYI :" + reversenumber);
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
        sout (a) = bir sayının 10 a bölümüsayının son basamağını verir.

        int a = number / 10 yapar isek java bir sayının son basamağını siliyor.
        2476 sayısı der isek 10 a bölümü 246,7 olacağı için integer da tam sayılar olduğu için 246 geri döndürür*/
    }

}

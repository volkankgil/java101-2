package strings�n�f�;

import java.util.Arrays;
import java.util.Locale;

public class strings�n�fkurallar {
    public static void main(String[] args) {
//String metodlar� static olmad��� i�in string nesnesini �retmeliyiz.

        String str = "patika";

        String patika ="   paT�ka  ";

        char d =98;

        char c ='b';

        System.out.println(str.charAt(2)); //indis say�s�na g�re string harfini verir.
        System.out.println(str.charAt(4 ));

        System.out.println(d);
        System.out.println(c);

        System.out.println(str.codePointAt(1)); //belirtilen indis'teki harfin unicode unu veriyor.
        System.out.println(str.codePointBefore(2)); //belirtilen indisten bir �nceki gharfin unicodeunu verdi. a harfi yani.

        System.out.println(str.compareTo(patika)); // 2 str'yi kar��la�t�r�yor. e�it de�il ise farkl�l�k rakam�na g�re ekrana ��kt� bas�yor. ayn� ise 0 bas�yor.

        System.out.println("--------------------");

        System.out.println(str.concat(".dev")); // bir string sonuna de�er yazd�rabiliyoruz.

        System.out.println(patika.contains("T�"));//Bir string i�erisinde bu harfler var m� diye bak�yor(B�Y�K K���K HARF DUYARLILI�I VAR) var ise true,yok ise false d�nd�r�yor.pk �eklinde sorar isek brle�ik olmad��� i�in false d�nd�r�r.

        System.out.println(str.endsWith("ti"));//son karakterlere bak�yor. e�er do�ru ise true , otherwise false.

        System.out.println(str.equals(patika)); //equlas true false, copmpare to say� d�nd�r�yor. B�Y�K K��K HARF DUYARLI.

        System.out.println(patika.equalsIgnoreCase(str)); //E�itli�ine bak�yor. b�y�k k���k harf duyarl� de�il.

        System.out.println(str.indexOf('a')); //dizideki harfin buldu�u ilk indeks de�erini d�nd�r�yor.

        System.out.println("----------------");

        System.out.println(str.isEmpty());//bo� mu de�ilmi diye bak�yor. bo� ise isempty oldu�undan geriye true, dolu ise false d�nd�r�yor. E�er de�er atanmam�� ise String str; gibi null'd�r.

        System.out.println(patika.lastIndexOf("a")); //en sondan ba�layarak indis de�erini veriyor.

        System.out.println(str.length());//string boyutunu veriyor.

        System.out.println(str.replace("a","f")); //stringteki b�t�n a'lar� f yap�yor.

        System.out.println(str.replaceFirst("a","�")); //ilk aharfini � yap�yor.

        String []sp=str.split("t");         //istedi�imiz harfi kelime i�erisinden ��kar�yor ve ekrana array olarak bast�r�yor.
        System.out.println(Arrays.toString(sp));

        System.out.println(str.startsWith("g�zel")); //e�er girdi�imiz de�er ile string ba�l�yor ise do�ru ,de�ilse yanl��.

        System.out.println(str.substring(1,4)); // 1. indisten ba�alyarak 3. indise kadar string de�erlerini ekrana bast�r�yoruz.

        System.out.println(patika.toLowerCase()); // string'in b�t�n hecelerini k���lt�yor.

        System.out.println(patika.toUpperCase(Locale.ROOT)); // string'in b�t�n heccelerini b�y�lt�yor.

        System.out.println(patika.trim()); //string'in sa��nda ve solundaki bo�luklar� kald�r�r. 2 de�er aras�dndaki bo�lu�u silmez.

        








    }
}

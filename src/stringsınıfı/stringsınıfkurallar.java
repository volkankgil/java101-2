package stringsýnýfý;

public class stringsýnýfkurallar {
    public static void main(String[] args) {
//String metodlarý static olmadýðý için string nesnesini üretmeliyiz.

        String str = "patika";

        String patika ="paTÝka";

        char d =98;

        char c ='b';

        System.out.println(str.charAt(2)); //indis sayýsýna göre string harfini verir.
        System.out.println(str.charAt(4 ));

        System.out.println(d);
        System.out.println(c);

        System.out.println(str.codePointAt(1)); //belirtilen indis'teki harfin unicode unu veriyor.
        System.out.println(str.codePointBefore(2)); //belirtilen indisten bir önceki gharfin unicodeunu verdi. a harfi yani.

        System.out.println(str.compareTo(patika)); // 2 str'yi karþýlaþtýrýyor. eþit deðil ise farklýlýk rakamýna göre ekrana çýktý basýyor. ayný ise 0 basýyor.

        System.out.println(str.concat(".dev")); // bir string sonuna deðer yazdýrabiliyoruz.

        System.out.println(patika.contains("TÝ"));//Bir string içerisinde bu harfler var mý diye bakýyor(BÜYÜK KÜÇÜK HARF DUYARLILIÐI VAR) var ise true,yok ise false döndürüyor.pk þeklinde sorar isek brleþik olmadýðý için false döndürür.

        System.out.println(str.endsWith("ti"));//son karakterlere bakýyor. eðer doðru ise true , otherwise false.

        System.out.println(str.equals(patika)); //equlas true false, copmpare to sayý döndürüyor. BÜYÜK KÜÇK HARF DUYARLI.

        System.out.println(patika.equalsIgnoreCase(str)); //Eþitliðine bakýyor. büyük küçük harf duyarlý deðil.

        System.out.println(str.indexOf('a')); //dizideki harfin bulduðu ilk indeks deðerini döndürüyor.

        System.out.println(str.isEmpty());//boþ mu deðilmi diye bakýyor. boþ ise isempty olduðundan geriye true, dolu ise false döndürüyor. Eðer deðer atanmamýþ ise String str; gibi null'dýr.

        System.out.println(patika.lastIndexOf("a")); //en sondan baþlayarak indis deðerini veriyor.

        System.out.println(str.length());//string boyutunu veriyor.

        System.out.println(str.replace("a","f")); //stringteki bütün a'larý f yapýyor.

        System.out.println(str.replaceFirst("a","þ")); //ilk aharfini þ yapýyor.

        System.out.println(str);






    }
}

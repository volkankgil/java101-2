package mathsýnýfý;

public class mathkurallar {
    public static void main(String[] args) {

        //Math sýnýfý varsayýlan olarak geldiði için import etmeye gerek yok. static metod olduðundan nesne üretmeye gerek yok.

        System.out.println(Math.abs(-15)); // mutlak deðerini veriyor.

        System.out.println(Math.sqrt(64)); // karekökünü veriyor.

        System.out.println(Math.cbrt(125)); //satýnýn küp kökünü veriyor

        System.out.println(Math.ceil(1.99)); // küsüratlý sayýyý hep yukarý yuvarlar.

        System.out.println(Math.floor(-3.3)); // küsratlý sayýyý hep aþaðýya yuvarlar.

        System.out.println(Math.round(1.5)); //hangisine yakýn ise integer türünde geri döndürüyor.tam ortada yukarý yuvarlýyor.

        System.out.println(Math.rint(1.4)); // hangi sayýya yakýn ise ona yuvarlar fakat double olarak.

        System.out.println(Math.pow(3,4)); //x sayýsýnýn üssünü veriyor.

        System.out.println(Math.random()*100); // 1 ile 0 arasýnda sayý oluþturur. 100 ile çarpýp yüzde deðerini buldum.

        System.out.println((int)(Math.random()*10));

        System.out.println(Math.signum(-5752)); //x sayýsýnýn iþaretcisini negatif ise -1 pozitif ise +1 döndürür.


    }
}

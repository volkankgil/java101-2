package maths�n�f�;

public class mathkurallar {
    public static void main(String[] args) {

        //Math s�n�f� varsay�lan olarak geldi�i i�in import etmeye gerek yok. static metod oldu�undan nesne �retmeye gerek yok.

        System.out.println(Math.abs(-15)); // mutlak de�erini veriyor.

        System.out.println(Math.sqrt(64)); // karek�k�n� veriyor.

        System.out.println(Math.cbrt(125)); //sat�n�n k�p k�k�n� veriyor

        System.out.println(Math.ceil(1.99)); // k�s�ratl� say�y� hep yukar� yuvarlar.

        System.out.println(Math.floor(-3.3)); // k�sratl� say�y� hep a�a��ya yuvarlar.

        System.out.println(Math.round(1.5)); //hangisine yak�n ise integer t�r�nde geri d�nd�r�yor.tam ortada yukar� yuvarl�yor.

        System.out.println(Math.rint(1.4)); // hangi say�ya yak�n ise ona yuvarlar fakat double olarak.

        System.out.println(Math.pow(3,4)); //x say�s�n�n �ss�n� veriyor.

        System.out.println(Math.random()*100); // 1 ile 0 aras�nda say� olu�turur. 100 ile �arp�p y�zde de�erini buldum.

        System.out.println((int)(Math.random()*10));

        System.out.println(Math.signum(-5752)); //x say�s�n�n i�aretcisini negatif ise -1 pozitif ise +1 d�nd�r�r.


    }
}

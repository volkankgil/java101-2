package methoddersi;

import java.util.Scanner;

public class gelişmişhesap {

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("TOPLAM : " + result);
    }

    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
    }

    static int çarpma(int a, int b) {
        int result;
        result = a * b;
        System.out.println("Çarpma :" + result);
        return result;
    }

    static double bölme(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Bölme : " + result);
            return result;
        } else {
            System.out.println("Sayı sıfıra bölünemez.");
            return 0;
        }
    }

    static int üs(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üs alma : " + result);
        return result;
    }

    static int fakt(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("faktöriyel : " + result);
        return result;

    }

    static void modalma(int a, int b) {
        int result = a % b;
        System.out.println("Mod : " + result);
    }

    static void cal(int a, int b) {
        int result1 = (a + b) * 2;
        int result2 = a * b;
        System.out.println("Diksörtgen Çevre: " + result1);
        System.out.println("Dikdörtgen Alan: " + result2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yaptınız";

        System.out.println(str);
        int select;

        do {
            System.out.println("İşlem Seçiniz:");
            select = input.nextInt();

            if (select==0){
                System.out.println("Çıkış yaptınız. GÜLE GÜLE");
                break;}

            System.out.println("Birinci sayıyı Giriniz:");
            int a = input.nextInt();
            System.out.println("İkinci sayıyı Giriniz:");
            int b = input.nextInt();

            switch (select) {

                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    çarpma(a, b);
                    break;
                case 4:
                    bölme(a, b);
                    break;
                case 5:
                    üs(a, b);
                    break;
                case 6:
                    fakt(a);
                    break;
                case 7:
                    modalma(a, b);
                    break;
                case 8:
                    cal(a, b);
                    break;
                case 0:
                    System.out.println("Çıkış yaptınız. GÜLE GÜLE");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız");
            }
        } while (select != 0) ;
        }
    }



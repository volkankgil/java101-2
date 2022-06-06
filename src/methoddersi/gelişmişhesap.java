package methoddersi;

import java.util.Scanner;

public class geli�mi�hesap {

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("TOPLAM : " + result);
    }

    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("��karma : " + result);
    }

    static int �arpma(int a, int b) {
        int result;
        result = a * b;
        System.out.println("�arpma :" + result);
        return result;
    }

    static double b�lme(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("B�lme : " + result);
            return result;
        } else {
            System.out.println("Say� s�f�ra b�l�nemez.");
            return 0;
        }
    }

    static int �s(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("�s alma : " + result);
        return result;
    }

    static int fakt(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("fakt�riyel : " + result);
        return result;

    }

    static void modalma(int a, int b) {
        int result = a % b;
        System.out.println("Mod : " + result);
    }

    static void cal(int a, int b) {
        int result1 = (a + b) * 2;
        int result2 = a * b;
        System.out.println("Diks�rtgen �evre: " + result1);
        System.out.println("Dikd�rtgen Alan: " + result2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yapt�n�z";

        System.out.println(str);
        int select;

        do {
            System.out.println("��lem Se�iniz:");
            select = input.nextInt();

            if (select==0){
                System.out.println("��k�� yapt�n�z. G�LE G�LE");
                break;}

            System.out.println("Birinci say�y� Giriniz:");
            int a = input.nextInt();
            System.out.println("�kinci say�y� Giriniz:");
            int b = input.nextInt();

            switch (select) {

                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    �arpma(a, b);
                    break;
                case 4:
                    b�lme(a, b);
                    break;
                case 5:
                    �s(a, b);
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
                    System.out.println("��k�� yapt�n�z. G�LE G�LE");
                    break;
                default:
                    System.out.println("Yanl�� se�im yapt�n�z");
            }
        } while (select != 0) ;
        }
    }



package maths�n�f�;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class say�tahminoyunu {
    public static void main(String[] args) {

        /*double randomnumber=Math.random()*100;
        System.out.println(randomnumber);*/

        /*int randomnumber = (int)(Math.random()*100);
        System.out.println(randomnumber);*/

        Random rand = new Random();

        int Randomnumber = rand.nextInt(100);
        System.out.println("Rastgele �retilen Say�: " + Randomnumber);

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[5];
        int right = 0;
        int count = 0;
        boolean isRight = true;


        while (right < 5) {
            System.out.println("-----------");
            System.out.println("Bir say� Giriniz :");
            int n = input.nextInt();
            numbers[right] = n;
            System.out.println("Girilen Say�lar :" + Arrays.toString(numbers));
                if (n > 0 && n < 100) {
                    if (n == Randomnumber) {
                        System.out.println("Tebrikler Say�y� Bildiniz. Tahmin etti�iniz Say� : " + Randomnumber);
                        break;
                    } else {
                        System.out.println("Yanl�� say� girdiniz.");
                        if (n > Randomnumber) {
                            System.out.println(+n + " Say�s� Gizli say�dan b�y�kt�r.");
                        } else {
                            System.out.println(+n + " Say�s� Gizli say�dan k���kt�r.");
                        }
                        right++;
                        System.out.println("KALAN HAKKINIZ:" + (5 - right));
                    }
                } else {
                    count++;
                    System.out.println("1 ve 100 aras�nda bir say� giriniz.");
                    if (count > 1) {
                        right++;
                        System.out.println("Kalan Hakk�n�z:" + (5 - right));
                    }
                }
            }
        }
    }




package mathsınıfı;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class sayıtahminoyunu {
    public static void main(String[] args) {

        /*double randomnumber=Math.random()*100;
        System.out.println(randomnumber);*/

        /*int randomnumber = (int)(Math.random()*100);
        System.out.println(randomnumber);*/

        Random rand = new Random();

        int Randomnumber = rand.nextInt(100);
        System.out.println("Rastgele Üretilen Sayı: " + Randomnumber);

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[5];
        int right = 0;
        int count = 0;
        boolean isRight = true;


        while (right < 5) {
            System.out.println("-----------");
            System.out.println("Bir sayı Giriniz :");
            int n = input.nextInt();
            numbers[right] = n;
            System.out.println("Girilen Sayılar :" + Arrays.toString(numbers));
                if (n > 0 && n < 100) {
                    if (n == Randomnumber) {
                        System.out.println("Tebrikler Sayıyı Bildiniz. Tahmin ettiğiniz Sayı : " + Randomnumber);
                        break;
                    } else {
                        System.out.println("Yanlış sayı girdiniz.");
                        if (n > Randomnumber) {
                            System.out.println(+n + " Sayısı Gizli sayıdan büyüktür.");
                        } else {
                            System.out.println(+n + " Sayısı Gizli sayıdan küçüktür.");
                        }
                        right++;
                        System.out.println("KALAN HAKKINIZ:" + (5 - right));
                    }
                } else {
                    count++;
                    System.out.println("1 ve 100 arasında bir sayı giriniz.");
                    if (count > 1) {
                        right++;
                        System.out.println("Kalan Hakkınız:" + (5 - right));
                    }
                }
            }
        }
    }




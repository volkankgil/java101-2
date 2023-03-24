package mathsýnýfý;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class sayýtahminoyunu {
    public static void main(String[] args) {

        /*double randomnumber=Math.random()*100;
        System.out.println(randomnumber);*/

        /*int randomnumber = (int)(Math.random()*100);
        System.out.println(randomnumber);*/

        Random rand = new Random();

        int Randomnumber = rand.nextInt(100);
        System.out.println("Rastgele Üretilen Sayý: " + Randomnumber);

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[5];
        int saytoright = 0;
        int count = 0;
        boolean isRight = true;


        while (saytoright < 5) {
            System.out.println("-----------");
            System.out.println("Bir sayý Giriniz :");
            int n = input.nextInt();
            numbers[saytoright] = n;
            System.out.println("Girilen Sayýlar :" + Arrays.toString(numbers));
                if (n > 0 && n < 100) {
                    if (n == Randomnumber) {
                        System.out.println("Tebrikler Sayýyý Bildiniz. Tahmin ettiðiniz Sayý : " + Randomnumber);
                        break;
                    } else {
                        System.out.println("Yanlýþ sayý girdiniz.");
                        if (n > Randomnumber) {
                            System.out.println(+n + " Sayýsý Gizli sayýdan büyüktür.");
                        } else {
                            System.out.println(+n + " Sayýsý Gizli sayýdan küçüktür.");
                        }
                        saytoright++;
                        System.out.println("KALAN HAKKINIZ:" + (5 - saytoright));
                    }
                } else {
                    count++;
                    System.out.println("1 ve 100 arasýnda bir sayý giriniz.");
                    if (count > 1) {
                        saytoright++;
                        System.out.println("Kalan Hakkýnýz:" + (5 - saytoright));
                    }
                }
            }
        }
    }




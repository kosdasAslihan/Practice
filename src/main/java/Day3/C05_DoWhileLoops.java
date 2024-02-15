package Day3;

import java.util.Scanner;

public class C05_DoWhileLoops {
    public static void main(String[] args) {
        /*

        - Kullanıcıdan pozitif tamsayılar isteyin.

        - 0 girdisi alındığında, döngüyü durdurun.

        - Döngü durdurulduğunda, toplam girilen sayı adedini ve sayıların toplamını print edin.

        - Kullanıcı negatif bir sayı girerse, bunun mümkün olmadığını belirtin.

        - Negatif sayı girilirse, bu sayıyı, sayı adedine veya toplama eklemeyin.

        -->Girilen x sayısının toplamı: y

        */
        Scanner input = new Scanner(System.in);

        int sayac = 0;
        int toplam = 0;

        do {

            System.out.println("Bir pozitif tamsayı giriniz: ");
            int sayi = input.nextInt();

            if (sayi == 0) {
                break;
            } else if (sayi < 0) {
                System.out.println("Negatif sayı girilemez");

            } else {
                sayac++;
                toplam += sayi;
            }


        } while (true);
        System.out.println("Girilen "+sayac+" sayının toplamı: "+toplam);



        //------------------------------------------
        //2.yol
        /*int sayac = 0;
        int sum = 0;

        do {

            System.out.println("Lutfen bir positive tam sayi giriniz \n bitirmek icin 0'a basin");
            int sayi = input.nextInt();

            if (sayi == 0) {
                break;
            } else if (sayi < 0) {
                System.out.println("Negative sayi kullanamazsiniz");
                continue;
            }
            sum += sayi;

            sayac++;

        } while (true);


        System.out.println("Girdiginiz " + sayac + " adet positive tamsayinin toplami : " + sum);*/
    }
}

package Day2;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {
        /*

        1. Kullanıcıdan bir sayı girmesini isteyin.
            - Numara sıfırdan küçük ise, konsola "Negatif" yazdırın.
            - Numara sıfırdan büyük ise,
                + Numara 10'dan küçük ise konsola "Rakam" yazdırın.
                + Numara 10'dan büyük ise konsola "Pozitif Sayı" yazdırın.

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Negatif");
        } else if (sayi == 0) {
            System.out.println("Sifir");
        } else { //Sifirdan buyuk ise

            if (sayi < 10) {
                System.out.println("Rakam");
            }else {
                System.out.println("Pozitif sayi");
            }

        }

        //Ek Sytnax Bilgisi
        /*if (sayi < 10)
            System.out.println("Rakam");
        else
            System.out.println("Pozitif sayi");
            if ve else'den sonra tek satir yazilacaksa parantez kullanimi olmadan da calisir
            */

    }
}

package day2;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        1. Kullanıcıdan bir sayı alın.
        2. Ternary kullanarak,
            - Girilen sayı çift ise konsola "Çift Sayı" yazdırın.
            - Girilen sayı tek ise, sayıyı 3 arttırarak konsola yazdırın.
         */
        //expression ? (true) : (false);

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        //1.yol
        Object sonuc = sayi % 2 == 0 ? "Cift sayi" : sayi + 3;

        //2.yol
        System.out.println(sayi % 2 == 0 ? "Cift sayi" : sayi + 3);
    }
}

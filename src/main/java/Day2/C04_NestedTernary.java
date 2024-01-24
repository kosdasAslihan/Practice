package Day2;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        /*
        1. Kullanıcıdan iki sayı alın.
        2. Ternary kullanarak,
            - Sayılar birbirine eşit ise, konsola "Sayılar birbirine eşit" yazdırın.
            - Sayılar birbirine eşit değil ise, büyük olan sayının karesini ekrana yazdırın.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = scanner.nextInt();

        Object sonuc = sayi1 == sayi2 ? ("Sayilar Esit") : (sayi1>sayi2 ? (sayi1*sayi1) : (sayi2*sayi2));
        System.out.println(sonuc);

    }
}

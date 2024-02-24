package day5;

import java.util.Scanner;

public class C03_HesapMakinesi {
    public static void main(String[] args) {
        /*
        4 işlem yapabilen bir hesap makinesi yazınız.

        - Kullanıcıdan yapılacak işlemi semboller ile alınız. ( +, -, *, / )
        - Kullanıcıdan 2 sayı girdisi isteyiniz.
        - Sonucu ekrana yazdırınız.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("İşlem türünü belirtiniz (+,-,*,/)");
        char islemTuru = scanner.next().charAt(0);

        if (islemTuru == '+' || islemTuru == '-' || islemTuru == '*' || islemTuru == '/') {

            System.out.println("1. sayiyi giriniz: ");
            double sayi1 = scanner.nextDouble();

            System.out.println("2. sayiyi giriniz: ");
            double sayi2 = scanner.nextDouble();

            if (!(islemTuru == '/' && sayi2 == 0)) {
                hesapla(sayi1,sayi2,islemTuru);

            } else {
                System.out.println("Geçersiz işlem türü");
            }
        }
    }

    public static void hesapla(double sayi1, double sayi2, char islemTuru){
        switch (islemTuru){
            case '+':
                System.out.println("Toplama: " + (sayi1+sayi2));
                break;
            case '-':
                System.out.println("Çıkarma: " + (sayi1-sayi2));
                break;
            case '*':
                System.out.println("Çarpma: " + (sayi1*sayi2));
                break;
            case '/':
                System.out.println("Bölme: " + (sayi1/sayi2));
                break;
        }
    }
}

package day2;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı isteyin,
            - Sayıların ikisi de pozitif ise sayıların toplamını yazdırın.
            - İkisi de negatif ise sayıların çarpımını yazdırın.
            - İkisi farklı işaretlere sahip ise sayılarla işlem yapılamadığını yazdırın.
            - Sayılarda sıfıra eşit olan var ise yutan eleman yazdırın.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(sayi1 * sayi2);
        } else if ((sayi1 > 0 && sayi2 < 0) || (sayi1 < 0 && sayi2 > 0)) {
            System.out.println("Sayilarla islem yapilamiyor");
            /*
            } else if (sayi1 * sayi2 < 0) {
            System.out.println("Islem yapilamiyor"); yukaridaki islem yerine bu islem de yazilabilirdi
            */
        } else {
            System.out.println("Yutan eleman");
        }
    }
}

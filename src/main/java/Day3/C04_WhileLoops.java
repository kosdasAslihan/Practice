package Day3;

public class C04_WhileLoops {
    public static void main(String[] args) {

        /*
        - Kullanıcıdan bir sayı isteyin.
        - Girilen sayıdan başlayarak, 10'un katına gelene kadar ardışık şekilde sayıları yazdırın.

        sayı = 12

        12,13,14,15,16,17,18,19

         */

        int sayi = 12;

        while (sayi %10 != 0) {
            System.out.println(sayi + " ");
            sayi++;
        }

    }
}

package Day3;

import java.util.Scanner;

public class C01_ForLoops {
    public static void main(String[] args) {
        /*
        Kullanicidan bir kelime girdisi isteyin.

        Loop, Kelimede c harfine rastlanana kadar devam etsin

        a harflerinin sayisi hesaplansin
        aaabaaacaa
        */

      Scanner scan = new Scanner(System.in);
      System.out.println("Bir kelime giriniz: ");
      String kelime = scan.next();

        /*
        Kelimenin lenght() değerini şart bloğuna eklemeliyiz.
        Karşılaştırıp yazdırmak
        charAt() methodu ile harf harf kontrol edelim
        */

        int sayi = 0;

        for (int i = 0; i < kelime.length(); i++){
            if (kelime.charAt(i) == 'c'){
                break;
            }
            if (kelime.charAt(i) == 'a'){
                sayi++;
            }
        }
        System.out.println(sayi);

    }
}

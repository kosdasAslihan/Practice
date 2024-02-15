package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {
        /*
        - 3 elemanlı bir int array oluşturunuz
        - Array'in elemanlarını, sırası ile kullanıcıdan alınız
        - Array'deki elemanların ortalamasını bulunuz, yazdırınız
        - Bulunan ortalamadan daha büyük değere sahip olan elemanları yazdırınız
        */

        int[] arr = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            System.out.println("Sayi giriniz: ");
            int sayi = scanner.nextInt();
            arr[i] = sayi;
            //arr[i] = scanner.nextInt(); yukarıdaki iki satırın kısa hali
        }

        System.out.println(Arrays.toString(arr));

        // - Array'deki elemanların ortalamasını bulunuz, yazdırınız
        // toplam/adet
        double toplam = 0;

        for (int s : arr){
            toplam += s; //toplam = toplam + sayi
        }
        double ortalama = toplam / arr.length;
        System.out.println("Ortalama: " + ortalama);

        //- Bulunan ortalamadan daha büyük değere sahip olan elemanları yazdırınız
        for (int sayi : arr){
            if (sayi > ortalama){
                System.out.println(sayi);
            }
        }
    }

}

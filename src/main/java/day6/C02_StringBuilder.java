package day6;

public class C02_StringBuilder {
    public static void main(String[] args) {
        /*

        - Kapasitesi 7 olan bir StringBuilder objesi oluşturun.
        - Capacity ve Length değerlerini yazdırın.
        - Bu objeye "hava güzel" verisini ekleyin ve yazdırın.
        - Aradaki boşluğu siliniz.
        - Veriyi ters çeviriniz.
        - Verinin son 4 karakterini siliniz.
        - Veriyi tekrar ters çevirin.
        - Verinin başına "Java " verisini ekleyin.

        */

        StringBuilder sb = new StringBuilder(7);

        //- Capacity ve Length değerlerini yazdırın.
        System.out.println(sb.capacity()); //7
        System.out.println(sb.length()); //0

        //- Bu objeye "hava güzel" verisini ekleyin ve yazdırın.
        sb.append("hava guzel");
        System.out.println(sb); //hava guzel

        //- Aradaki boşluğu siliniz.
        int boslukIndex = sb.indexOf(" ");
        sb.deleteCharAt(boslukIndex);
        System.out.println(sb); //havaguzel

        //- Veriyi ters çeviriniz.
        sb.reverse();
        System.out.println(sb); //lezugavah

        //- Verinin son 4 karakterini siliniz.
        sb.delete(sb.length()-4, sb.length());
        System.out.println(sb); //lezug

        //- Veriyi tekrar ters çevirin.
        sb.reverse();
        System.out.println(sb); //guzel

        //- Verinin başına "Java " verisini ekleyin
        sb.insert(0,"Java ");
        System.out.println(sb); //Java guzel

        System.out.println(sb.capacity()); //16
        System.out.println(sb.length()); //10

    }
}

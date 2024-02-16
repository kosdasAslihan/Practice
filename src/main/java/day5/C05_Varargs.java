package day5;

public class C05_Varargs {
    public static void main(String[] args) {
            /*

                    Verilen kelimeler arasından en uzun olanı yazdırınız

             */

        String kelime1 = "merhaba";
        String kelime2 = "test";
        String kelime3 = "sdhjshfkjwdw";

        enUzunKelimeYazdir(kelime1, kelime2, kelime3, "yenikelime"); //sdhjshfkjwdw
    }

    private static void enUzunKelimeYazdir(String... kelimeler) {

        String enUzunKelime = "";
        for (String kelime : kelimeler) {
            if (kelime.length() > enUzunKelime.length()) {
                enUzunKelime = kelime;
            }
        }
        System.out.println(enUzunKelime);
    }
}
